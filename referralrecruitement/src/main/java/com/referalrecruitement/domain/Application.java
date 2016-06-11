package com.referalrecruitement.domain;

import java.util.Date;
import java.util.List;

public class Application {

	
	 private int ApplicationID ;
     
   
     private String FirstName ;
     
    
     private String LastName ;
     
     
     private String Email ;
     
     
     private String PhoneNumber ;
     
    
     private byte[] CV ;
     
     
     private Date  Date ;
     
     private String Status ;
private Offer offer;
private List<Feedback> feedbacks;	
private Referral referral;

	public List<Feedback> getFeedbacks() {
	return feedbacks;
}

public void setFeedbacks(List<Feedback> feedbacks) {
	this.feedbacks = feedbacks;
}

	public Offer getOffer() {
	return offer;
}

public void setOffer(Offer offer) {
	this.offer = offer;
}

	public int getApplicationID() {
		return ApplicationID;
	}

	public void setApplicationID(int applicationID) {
		ApplicationID = applicationID;
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

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public byte[] getCV() {
		return CV;
	}

	public void setCV(byte[] cV) {
		CV = cV;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Referral getReferral() {
		return referral;
	}

	public void setReferral(Referral referral) {
		this.referral = referral;
	}
     
     
    
	
}
