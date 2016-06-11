package com.referalrecruitement.service;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import com.referralrecruitement.http.client.ReferralrecritementClient;



@Path("/personnelAccountService")
public class PersonnelAccountService {

	@EJB
	ReferralrecritementClient httpClient;
	
	public PersonnelAccountService() {
		
	}
	
	
	
}
