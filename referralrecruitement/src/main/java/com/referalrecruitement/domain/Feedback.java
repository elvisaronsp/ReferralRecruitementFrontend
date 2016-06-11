package com.referalrecruitement.domain;

public class Feedback {

	 private int FeedbackID;

    
     private String Note;
     
    
     private  Application Application;

	public int getFeedbackID() {
		return FeedbackID;
	}

	public void setFeedbackID(int feedbackID) {
		FeedbackID = feedbackID;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	public Application getApplication() {
		return Application;
	}

	public void setApplication(Application application) {
		Application = application;
	}
     
}
