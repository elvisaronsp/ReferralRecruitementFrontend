package com.referalrecruitement.domain;

import java.util.List;
import java.util.Date;

public class Offer {
	 public int OfferID ;
     
     public String OfferName ;
     
    
    
     public String Note ;
     
     
     public Date Date ;
     
    
     public  Recruiter Recruiter ;
     
    
     public  Reward Reward ;
     
     public List<Application> Applications ;
     public  List<Notification> Notifications ;
	public int getOfferID() {
		return OfferID;
	}
	public void setOfferID(int offerID) {
		OfferID = offerID;
	}
	public String getOfferName() {
		return OfferName;
	}
	public void setOfferName(String offerName) {
		OfferName = offerName;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public Recruiter getRecruiter() {
		return Recruiter;
	}
	public void setRecruiter(Recruiter recruiter) {
		Recruiter = recruiter;
	}
	public Reward getReward() {
		return Reward;
	}
	public void setReward(Reward reward) {
		Reward = reward;
	}
	public List<Application> getApplications() {
		return Applications;
	}
	public void setApplications(List<Application> applications) {
		Applications = applications;
	}
	public List<Notification> getNotifications() {
		return Notifications;
	}
	public void setNotifications(List<Notification> notifications) {
		Notifications = notifications;
	}	
     
}
