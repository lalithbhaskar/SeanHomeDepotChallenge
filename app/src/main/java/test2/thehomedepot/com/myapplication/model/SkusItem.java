package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class SkusItem{

	@SerializedName("itemId")
	private String itemId;

	@SerializedName("availabilityType")
	private String availabilityType;

	@SerializedName("productId")
	private String productId;

	@SerializedName("shipping")
	private Shipping shipping;

	@SerializedName("storeSku")
	private StoreSku storeSku;

	@SerializedName("ratingsReviews")
	private RatingsReviews ratingsReviews;

	@SerializedName("productUrl")
	private String productUrl;

	@SerializedName("info")
	private Info info;

	public void setItemId(String itemId){
		this.itemId = itemId;
	}

	public String getItemId(){
		return itemId;
	}

	public void setAvailabilityType(String availabilityType){
		this.availabilityType = availabilityType;
	}

	public String getAvailabilityType(){
		return availabilityType;
	}

	public void setProductId(String productId){
		this.productId = productId;
	}

	public String getProductId(){
		return productId;
	}

	public void setShipping(Shipping shipping){
		this.shipping = shipping;
	}

	public Shipping getShipping(){
		return shipping;
	}

	public void setStoreSku(StoreSku storeSku){
		this.storeSku = storeSku;
	}

	public StoreSku getStoreSku(){
		return storeSku;
	}

	public void setRatingsReviews(RatingsReviews ratingsReviews){
		this.ratingsReviews = ratingsReviews;
	}

	public RatingsReviews getRatingsReviews(){
		return ratingsReviews;
	}

	public void setProductUrl(String productUrl){
		this.productUrl = productUrl;
	}

	public String getProductUrl(){
		return productUrl;
	}

	public void setInfo(Info info){
		this.info = info;
	}

	public Info getInfo(){
		return info;
	}

	@Override
 	public String toString(){
		return 
			"SkusItem{" + 
			"itemId = '" + itemId + '\'' + 
			",availabilityType = '" + availabilityType + '\'' + 
			",productId = '" + productId + '\'' + 
			",shipping = '" + shipping + '\'' + 
			",storeSku = '" + storeSku + '\'' + 
			",ratingsReviews = '" + ratingsReviews + '\'' + 
			",productUrl = '" + productUrl + '\'' + 
			",info = '" + info + '\'' + 
			"}";
		}
}