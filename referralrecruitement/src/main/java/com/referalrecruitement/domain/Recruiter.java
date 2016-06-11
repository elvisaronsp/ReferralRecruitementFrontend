package com.referalrecruitement.domain;

import java.util.List;

public class Recruiter extends Personal {

	private List<Offer> Offers;

	public List<Offer> getOffers() {
		return Offers;
	}

	public void setOffers(List<Offer> offers) {
		Offers = offers;
	}
      
      
}
