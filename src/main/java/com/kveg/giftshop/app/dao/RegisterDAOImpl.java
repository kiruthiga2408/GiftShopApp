package com.kveg.giftshop.app.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kveg.giftshop.exception.DBException;
import com.kveg_giftshop_app.Register;
import com.kveg_giftshop_app.dao.RegisterDAO;
import com.mysql.cj.log.Log;


public class RegisterDAOImpl implements RegisterDAO {

	public void register(Register reg) throws DBException {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
			String username = "rev_user";
			String password = "rev_user";
			connection = DriverManager.getConnection(url, username, password);

			String sql = "INSERT INTO kiru_giftshop_app_register_form( NAME,email_id ,create_password,confirm_password,contact_number) values ( ?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, reg.getName());
			statement.setString(2, reg.getEmailId());
			statement.setString(3, reg.getCreatePassword());
			statement.setString(4, reg.getConfirmPassword());
			statement.setString(4, reg.getContactNumber());
			

			int rows = statement.executeUpdate();
			System.out.println("No of rows inserted:" + rows);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e.getMessage(), e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<reg> findAll() {

		List<reg> regList = new ArrayList<reg>();

		Connection connection = null;
		PreparedStatement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
			String username = "rev_user";
			String password = "rev_user";
			connection = DriverManager.getConnection(url, username, password);
			String sql = "SELECT NAME,email_id ,create_password,confirm_password,contact_number FROM kiru_giftshop_app_register_form";
			statement = connection.prepareStatement(sql);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				String name = rs.getString("Name");
				String emailId = rs.getString("email_id");
				String createPassword= rs.getString("create_password");
				String confirmPassword= rs.getString("confirm_password");
				String contactNumber= rs.getString("contact_number");

				Register reg = new Register();
				reg.setName(name);
				reg.setEmailId(emailId);
				reg.setCreatePassword(createPassword);
				reg.setConfirmPassword(contactNumber);
				

				regList.add(reg);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e.getMessage(), e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return regList;
	}

}
	