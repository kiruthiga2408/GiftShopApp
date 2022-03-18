package com.kveg.giftshop.app.RegisterDAO;

public class RegisterDAOTest {

	
	public static void main(String[] args)  throws DBException{
		RegisterDAO regDAO = new regDAOImpl();
		List<reg> regList = regDAO.findAll();
		for (Register reg : regList) {
			System.out.println(reg);
		}
		private static void testAddRegister() throws DBException {
			Register reg = new Register();
			reg.setName("Prabhu");
			reg.setEmail("p@gmail.com");
			reg.setPassword("pass1234");
			reg.setCollegeName("LVEC");
			
			System.out.println(user);
			
			UserDAO userDAO = new UserDAOImpl();
			userDAO.register(user);
		}

	}
	}

}
