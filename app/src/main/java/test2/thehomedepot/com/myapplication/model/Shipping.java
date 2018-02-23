package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Shipping{

	@SerializedName("itemLevelFreeShip")
	private boolean itemLevelFreeShip;

	@SerializedName("freeShippingThreshold")
	private String freeShippingThreshold;

	@SerializedName("freeShippingMessage")
	private String freeShippingMessage;

	@SerializedName("eligibleForFreeShipping")
	private boolean eligibleForFreeShipping;

	public void setItemLevelFreeShip(boolean itemLevelFreeShip){
		this.itemLevelFreeShip = itemLevelFreeShip;
	}

	public boolean isItemLevelFreeShip(){
		return itemLevelFreeShip;
	}

	public void setFreeShippingThreshold(String freeShippingThreshold){
		this.freeShippingThreshold = freeShippingThreshold;
	}

	public String getFreeShippingThreshold(){
		return freeShippingThreshold;
	}

	public void setFreeShippingMessage(String freeShippingMessage){
		this.freeShippingMessage = freeShippingMessage;
	}

	public String getFreeShippingMessage(){
		return freeShippingMessage;
	}

	public void setEligibleForFreeShipping(boolean eligibleForFreeShipping){
		this.eligibleForFreeShipping = eligibleForFreeShipping;
	}

	public boolean isEligibleForFreeShipping(){
		return eligibleForFreeShipping;
	}

	@Override
 	public String toString(){
		return 
			"Shipping{" + 
			"itemLevelFreeShip = '" + itemLevelFreeShip + '\'' + 
			",freeShippingThreshold = '" + freeShippingThreshold + '\'' + 
			",freeShippingMessage = '" + freeShippingMessage + '\'' + 
			",eligibleForFreeShipping = '" + eligibleForFreeShipping + '\'' + 
			"}";
		}
}