package com.kveg.giftshop;

import java.util.List;

import com.kveg.giftshop.app.dao.RegisterDAOImpl;
import com.kveg.giftshop.exception.DBException;
import com.kveg_giftshop_app.Register;
import com.kveg_giftshop_app.dao.RegisterDAO;


	public class RegisterDAOTest  {

		public static void main(String[] args) throws DBException {

			//testAddUser();
			
			RegisterDAO regDAO = new RegisterDAOImpl();
			List<Register> regList = regDAO.findAll();
			for (Register reg : regList) {
				System.out.println(reg);
			}
		}

		private static void testAddRegister() throws DBException {
			Register reg = new Register();
			reg.setName("kiruthiga");
			reg.setEmailId("kiru@gmail.com");
			reg.setCreatePassword("pass123");
			reg.setConfirmPassword("pass123");
			reg.setContactNumber("1987552770");
			
			System.out.println(reg);
			
			RegisterDAO regDAO = new RegisterDAOImpl();
			RegisterDAO.register(reg);
		}

	}