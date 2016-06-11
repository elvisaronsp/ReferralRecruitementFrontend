package com.referalrecruitement.domain;

import java.util.List;

public class Tenancy {
	private int EntrepriseID;

	private String EntrepriseName;

	private byte[] Logo;
	private String TextColor;
	private String TmpColor;
	private boolean Status;

	private Administrator Administrator;
	
	private List<Referral> Referrals;
	private List<Recruiter> Recruiters;
	
	public int getEntrepriseID() {
		return EntrepriseID;
	}
	public void setEntrepriseID(int entrepriseID) {
		EntrepriseID = entrepriseID;
	}
	public String getEntrepriseName() {
		return EntrepriseName;
	}
	public void setEntrepriseName(String entrepriseName) {
		EntrepriseName = entrepriseName;
	}
	public byte[] getLogo() {
		return Logo;
	}
	public void setLogo(byte[] logo) {
		Logo = logo;
	}
	public String getTextColor() {
		return TextColor;
	}
	public void setTextColor(String textColor) {
		TextColor = textColor;
	}
	public String getTmpColor() {
		return TmpColor;
	}
	public void setTmpColor(String tmpColor) {
		TmpColor = tmpColor;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public Administrator getAdministrator() {
		return Administrator;
	}
	public void setAdministrator(Administrator administrator) {
		Administrator = administrator;
	}
	public List<Referral> getReferals() {
		return Referrals;
	}
	public void setReferals(List<Referral> referals) {
		Referrals = referals;
	}
	public List<Recruiter> getRecruiters() {
		return Recruiters;
	}
	public void setRecruiters(List<Recruiter> recruiters) {
		Recruiters = recruiters;
	}
	
     
}
