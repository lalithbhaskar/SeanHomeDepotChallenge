package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class InventoryItem{

	@SerializedName("sellableQty")
	private int sellableQty;

	@SerializedName("qty")
	private int qty;

	@SerializedName("store")
	private String store;

	public void setSellableQty(int sellableQty){
		this.sellableQty = sellableQty;
	}

	public int getSellableQty(){
		return sellableQty;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public int getQty(){
		return qty;
	}

	public void setStore(String store){
		this.store = store;
	}

	public String getStore(){
		return store;
	}

	@Override
 	public String toString(){
		return 
			"InventoryItem{" + 
			"sellableQty = '" + sellableQty + '\'' + 
			",qty = '" + qty + '\'' + 
			",store = '" + store + '\'' + 
			"}";
		}
}