package com.kveg_giftshop_app;

public class Register {

		public String name;
		public String emailId;
		public String createPassword;
		public String confirmPassword;
		public String contactNumber;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getCreatePassword() {
			return createPassword;
		}

		public void setCreatePassword(String createPassword) {
			this.createPassword = createPassword;
		}

		public String getConfirmPassword() {
			return confirmPassword;
		}

		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		@Override
		public String toString() {
			return "Register [name=" + name + ", emailId=" + emailId + ", createPassword=" + createPassword
					+ ", confirmPassword=" + confirmPassword + ", contactNumber=" + contactNumber + "]";
		}

		
		
	}