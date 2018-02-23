package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class BuyOnlinePickupInStore{

	@SerializedName("eligibilityStatus")
	private boolean eligibilityStatus;

	@SerializedName("checkStoreLink")
	private boolean checkStoreLink;

	public void setEligibilityStatus(boolean eligibilityStatus){
		this.eligibilityStatus = eligibilityStatus;
	}

	public boolean isEligibilityStatus(){
		return eligibilityStatus;
	}

	public void setCheckStoreLink(boolean checkStoreLink){
		this.checkStoreLink = checkStoreLink;
	}

	public boolean isCheckStoreLink(){
		return checkStoreLink;
	}

	@Override
 	public String toString(){
		return 
			"BuyOnlinePickupInStore{" + 
			"eligibilityStatus = '" + eligibilityStatus + '\'' + 
			",checkStoreLink = '" + checkStoreLink + '\'' + 
			"}";
		}
}