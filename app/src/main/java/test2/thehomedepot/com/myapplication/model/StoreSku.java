package test2.thehomedepot.com.myapplication.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class StoreSku{

	@SerializedName("fulfillmentOptions")
	private FulfillmentOptions fulfillmentOptions;

	@SerializedName("inventory")
	private List<InventoryItem> inventory;

	@SerializedName("pricing")
	private Pricing pricing;

	public void setFulfillmentOptions(FulfillmentOptions fulfillmentOptions){
		this.fulfillmentOptions = fulfillmentOptions;
	}

	public FulfillmentOptions getFulfillmentOptions(){
		return fulfillmentOptions;
	}

	public void setInventory(List<InventoryItem> inventory){
		this.inventory = inventory;
	}

	public List<InventoryItem> getInventory(){
		return inventory;
	}

	public void setPricing(Pricing pricing){
		this.pricing = pricing;
	}

	public Pricing getPricing(){
		return pricing;
	}

	@Override
 	public String toString(){
		return 
			"StoreSku{" + 
			"fulfillmentOptions = '" + fulfillmentOptions + '\'' + 
			",inventory = '" + inventory + '\'' + 
			",pricing = '" + pricing + '\'' + 
			"}";
		}
}