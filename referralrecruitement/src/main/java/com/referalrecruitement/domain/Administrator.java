package com.referalrecruitement.domain;

import java.util.List;

public class Administrator {
	
public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int AdministratorID;
	private String FirstName;
	private String LastName;

	private String Email;

	private String Password;

	private String ConfirmePassword;
	private List<Tenancy> Tenancies;

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

    
	public int getAdministratorID() {
		return AdministratorID;
	}


	public void setAdministratorID(int administratorID) {
		AdministratorID = administratorID;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public List<Tenancy> getTenancies() {
		return Tenancies;
	}


	public void setTenancies(List<Tenancy> tenancies) {
		Tenancies = tenancies;
	}
    

}
