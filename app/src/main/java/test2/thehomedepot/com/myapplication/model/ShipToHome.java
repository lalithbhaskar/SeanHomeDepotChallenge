package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class ShipToHome{

	@SerializedName("eligibilityStatus")
	private boolean eligibilityStatus;

	public void setEligibilityStatus(boolean eligibilityStatus){
		this.eligibilityStatus = eligibilityStatus;
	}

	public boolean isEligibilityStatus(){
		return eligibilityStatus;
	}

	@Override
 	public String toString(){
		return 
			"ShipToHome{" + 
			"eligibilityStatus = '" + eligibilityStatus + '\'' + 
			"}";
		}
}