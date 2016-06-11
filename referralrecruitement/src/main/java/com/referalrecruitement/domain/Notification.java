package com.referalrecruitement.domain;

import java.util.Date;

public class Notification {
	
	   public int NotificationID;
       
       
       public String Note ;
       
     
       public Date Date;
       
     
       
      
       public  Offer Offer;
       
       
       public  Referral Referral ;


	public int getNotificationID() {
		return NotificationID;
	}


	public void setNotificationID(int notificationID) {
		NotificationID = notificationID;
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


	public Offer getOffer() {
		return Offer;
	}


	public void setOffer(Offer offer) {
		Offer = offer;
	}


	public Referral getReferral() {
		return Referral;
	}


	public void setReferral(Referral referral) {
		Referral = referral;
	}
       
}
