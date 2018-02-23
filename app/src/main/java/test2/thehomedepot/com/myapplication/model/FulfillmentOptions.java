package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class FulfillmentOptions{

	@SerializedName("deliverFromStore")
	private DeliverFromStore deliverFromStore;

	@SerializedName("storeInventory")
	private String storeInventory;

	@SerializedName("shipToHome")
	private ShipToHome shipToHome;

	@SerializedName("fulfillable")
	private boolean fulfillable;

	@SerializedName("backOrder")
	private boolean backOrder;

	@SerializedName("buyOnlinePickupInStore")
	private BuyOnlinePickupInStore buyOnlinePickupInStore;

	@SerializedName("storemessage")
	private String storemessage;

	@SerializedName("deliveryMessage")
	private DeliveryMessage deliveryMessage;

	@SerializedName("checkinventory")
	private boolean checkinventory;

	@SerializedName("storeStatus")
	private int storeStatus;

	public void setDeliverFromStore(DeliverFromStore deliverFromStore){
		this.deliverFromStore = deliverFromStore;
	}

	public DeliverFromStore getDeliverFromStore(){
		return deliverFromStore;
	}

	public void setStoreInventory(String storeInventory){
		this.storeInventory = storeInventory;
	}

	public String getStoreInventory(){
		return storeInventory;
	}

	public void setShipToHome(ShipToHome shipToHome){
		this.shipToHome = shipToHome;
	}

	public ShipToHome getShipToHome(){
		return shipToHome;
	}

	public void setFulfillable(boolean fulfillable){
		this.fulfillable = fulfillable;
	}

	public boolean isFulfillable(){
		return fulfillable;
	}

	public void setBackOrder(boolean backOrder){
		this.backOrder = backOrder;
	}

	public boolean isBackOrder(){
		return backOrder;
	}

	public void setBuyOnlinePickupInStore(BuyOnlinePickupInStore buyOnlinePickupInStore){
		this.buyOnlinePickupInStore = buyOnlinePickupInStore;
	}

	public BuyOnlinePickupInStore getBuyOnlinePickupInStore(){
		return buyOnlinePickupInStore;
	}

	public void setStoremessage(String storemessage){
		this.storemessage = storemessage;
	}

	public String getStoremessage(){
		return storemessage;
	}

	public void setDeliveryMessage(DeliveryMessage deliveryMessage){
		this.deliveryMessage = deliveryMessage;
	}

	public DeliveryMessage getDeliveryMessage(){
		return deliveryMessage;
	}

	public void setCheckinventory(boolean checkinventory){
		this.checkinventory = checkinventory;
	}

	public boolean isCheckinventory(){
		return checkinventory;
	}

	public void setStoreStatus(int storeStatus){
		this.storeStatus = storeStatus;
	}

	public int getStoreStatus(){
		return storeStatus;
	}

	@Override
 	public String toString(){
		return 
			"FulfillmentOptions{" + 
			"deliverFromStore = '" + deliverFromStore + '\'' + 
			",storeInventory = '" + storeInventory + '\'' + 
			",shipToHome = '" + shipToHome + '\'' + 
			",fulfillable = '" + fulfillable + '\'' + 
			",backOrder = '" + backOrder + '\'' + 
			",buyOnlinePickupInStore = '" + buyOnlinePickupInStore + '\'' + 
			",storemessage = '" + storemessage + '\'' + 
			",deliveryMessage = '" + deliveryMessage + '\'' + 
			",checkinventory = '" + checkinventory + '\'' + 
			",storeStatus = '" + storeStatus + '\'' + 
			"}";
		}
}