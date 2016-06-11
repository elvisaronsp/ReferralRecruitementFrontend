package com.referalrecruitement.domain;

import java.util.List;

public class Reward {
	  private int RewardID;
      
     
      private int Sharing;
      
      
      private int HRIntrvw;
      
      
      private int TechIntrvw;
      
      
      private int MnIntrvw;
      
      
      private int Hire;
     private List<Offer> offers ;

	public int getRewardID() {
		return RewardID;
	}


	public void setRewardID(int rewardID) {
		RewardID = rewardID;
	}


	public int getSharing() {
		return Sharing;
	}


	public void setSharing(int sharing) {
		Sharing = sharing;
	}


	public int getHRIntrvw() {
		return HRIntrvw;
	}


	public void setHRIntrvw(int hRIntrvw) {
		HRIntrvw = hRIntrvw;
	}


	public int getTechIntrvw() {
		return TechIntrvw;
	}


	public void setTechIntrvw(int techIntrvw) {
		TechIntrvw = techIntrvw;
	}


	public int getMnIntrvw() {
		return MnIntrvw;
	}


	public void setMnIntrvw(int mnIntrvw) {
		MnIntrvw = mnIntrvw;
	}


	public int getHire() {
		return Hire;
	}


	public void setHire(int hire) {
		Hire = hire;
	}


	public List<Offer> getOffers() {
		return offers;
	}


	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

 
}
