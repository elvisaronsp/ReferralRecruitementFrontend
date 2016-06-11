package com.referalrecruitement.domain;

public class Personal {
	 private int PersonalID;
     
     private String FirstName ;
     private String LastName ;
     
     
     private String Email ;
     
     
     private String Password ;
     
    
     private String ConfirmePassword ;
    
     private Tenancy Tenancy ;

	public int getPersonalID() {
		return PersonalID;
	}

	public void setPersonalID(int personalID) {
		PersonalID = personalID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmePassword() {
		return ConfirmePassword;
	}

	public void setConfirmePassword(String confirmePassword) {
		ConfirmePassword = confirmePassword;
	}

	public Tenancy getEntreprise() {
		return Tenancy;
	}

	public void setEntreprise(Tenancy entreprise) {
		Tenancy = entreprise;
	}
     
}
