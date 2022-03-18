package com.kveg_giftshop_app;

	abstract class CommonDAO {
		
		public Connection getConnection(){
				.... Class.forName, DriverManager.getConnection()....
		}

		public void close(Connection con) {
			con.close();
		}   

		public void executeUpdate(String sql) {
				Connection con = getConnection();
				Statement statement = con.createStatement();
			int rows =statement.executeUpdate(sql);
		}

	}

	class MovieDAO extends CommonDAO {

		public void addGift(Gift gift) {
			Connection connection = getConnection();
			...
			close(connection);
			
		}

		//overriding
		@Override
	