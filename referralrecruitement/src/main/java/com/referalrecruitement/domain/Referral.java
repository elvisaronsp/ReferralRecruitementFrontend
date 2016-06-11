package com.referalrecruitement.domain;

import java.util.List;

public class Referral extends Personal {
	   private int Bonus ;
       private int Success ;
      
       private List<Notification> Notifications ;
       private List<Application> Applicaions;
	public int getBonus() {
		return Bonus;
	}

	public void setBonus(int bonus) {
		Bonus = bonus;
	}

	public int getSuccess() {
		return Success;
	}

	public void setSuccess(int success) {
		Success = success;
	}

	public List<Notification> getNotifications() {
		return Notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		Notifications = notifications;
	}

	public List<Application> getApplicaions() {
		return Applicaions;
	}

	public void setApplicaions(List<Application> applicaions) {
		Applicaions = applicaions;
	}

	
       
}
