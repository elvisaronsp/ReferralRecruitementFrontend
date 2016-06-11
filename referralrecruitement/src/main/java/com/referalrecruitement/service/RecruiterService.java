package com.referalrecruitement.service;

import java.io.IOException;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.referalrecruitement.domain.Recruiter;
import com.referralrecruitement.http.client.ReferralrecritementClient;

/**
 * Session Bean implementation class RecruiterService
 */
@Path("/recruiterService")

public class RecruiterService implements RecruiterServiceRemote {

	@EJB
	ReferralrecritementClient httpClient;
	
	
    public RecruiterService() {
        // TODO Auto-generated constructor stub
    }

    @POST
	@Path("/createIdea")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean createRecuiter(String rec) {
    	ObjectMapper mapper = new ObjectMapper();
		Recruiter recruiter = new Recruiter();
		try {
			//desialization
			recruiter = mapper.readValue(rec, Recruiter.class);
		} catch (com.fasterxml.jackson.core.JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rec = mapper.writeValueAsString(recruiter);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //httpClient.Post("http://recruitementapi.azurewebsites.net/api/Recruiter",rec);
		return true;
	}
    
    @GET
	@Path("/getRecruiter")
	@Produces(MediaType.TEXT_PLAIN)
	public String getIdea(){
    	
    	return httpClient.Get("http://recruitementapi.azurewebsites.net/api/Recruiter");
	}
    
    

}
