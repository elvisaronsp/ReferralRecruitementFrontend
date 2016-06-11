package com.referalrecruitement.service;

import java.io.IOException;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.referalrecruitement.domain.Offer;
import com.referralrecruitement.http.client.ReferralrecritementClient;

@Path("/jobOfferService")
public class JobOfferService {

	@EJB
	ReferralrecritementClient httpClient;

	public JobOfferService() {

	}

	@POST
	@Path("/createJobOffer")
	@Consumes(MediaType.APPLICATION_JSON)
	public String createJobOffer(String jo) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		Offer jobOffer = new Offer();
		try {

			jobOffer = mapper.readValue(jo, Offer.class);

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
			jo = mapper.writeValueAsString(jobOffer);
			System.out.println(jo);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (httpClient.post(
				"http://recruitementapi.azurewebsites.net/api/Offer", jo));

	}

	@GET
	@Path("/getOffer/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getOffer(@PathParam("id") String id) {
		String url = "http://recruitementapi.azurewebsites.net/api/Offer/" + id;
		String s = httpClient.Get(url);
		// Offer o=new Offer();
		// o.setDate(new Date());
		// o.setNote("ddd");
		// o.setOfferName("ssss");
		// Reward r=new Reward();
		//
		// r.setHire(200);
		// r.setHRIntrvw(100);
		// r.setMnIntrvw(300);
		// r.setSharing(0);
		// r.setTechIntrvw(300);
		// o.setReward(r);
		//
		// Notification n=new Notification();
		// n.setDate(new Date());
		// n.setNote("fhvgjbk");
		//
		// ObjectMapper mapper = new ObjectMapper();
		// String rec="sss";
		// try {
		// rec = mapper.writeValueAsString(r);
		// } catch (JsonProcessingException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		return s;
	}

	@GET
	@Path("/getOffers")
	@Produces(MediaType.APPLICATION_JSON)
	public String getOffer() {
		String url = "http://recruitementapi.azurewebsites.net/api/Offer/";
		String s = httpClient.Get(url);

		return s;
	}

	@DELETE
	@Path("/deleteJobs/{id}")
	@Consumes(MediaType.TEXT_PLAIN)
	public void deleteJobs(@PathParam("id") String id) {
		httpClient.DELETE("http://recruitementapi.azurewebsites.net/api/Offer/"
				+ id);
	}

	@PUT
	@Path("/updateIdea/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateIdea(@PathParam("id") String id, String newIdeaJson) {
		httpClient.Put("http://recruitementapi.azurewebsites.net/api/Offer/"
				+ id, newIdeaJson);
		return "Idea seccessfully updated";
	}

}
