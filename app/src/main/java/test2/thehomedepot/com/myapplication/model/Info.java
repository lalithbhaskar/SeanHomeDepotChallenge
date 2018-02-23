package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Info{

	@SerializedName("departmentName")
	private String departmentName;

	@SerializedName("departmentUrl")
	private String departmentUrl;

	@SerializedName("productLabel")
	private String productLabel;

	@SerializedName("brandName")
	private String brandName;

	@SerializedName("imageId")
	private String imageId;

	@SerializedName("departmentId")
	private int departmentId;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("storeSkuNumber")
	private String storeSkuNumber;

	@SerializedName("modelNumber")
	private String modelNumber;

	@SerializedName("productType")
	private String productType;

	public void setDepartmentName(String departmentName){
		this.departmentName = departmentName;
	}

	public String getDepartmentName(){
		return departmentName;
	}

	public void setDepartmentUrl(String departmentUrl){
		this.departmentUrl = departmentUrl;
	}

	public String getDepartmentUrl(){
		return departmentUrl;
	}

	public void setProductLabel(String productLabel){
		this.productLabel = productLabel;
	}

	public String getProductLabel(){
		return productLabel;
	}

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setImageId(String imageId){
		this.imageId = imageId;
	}

	public String getImageId(){
		return imageId;
	}

	public void setDepartmentId(int departmentId){
		this.departmentId = departmentId;
	}

	public int getDepartmentId(){
		return departmentId;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setStoreSkuNumber(String storeSkuNumber){
		this.storeSkuNumber = storeSkuNumber;
	}

	public String getStoreSkuNumber(){
		return storeSkuNumber;
	}

	public void setModelNumber(String modelNumber){
		this.modelNumber = modelNumber;
	}

	public String getModelNumber(){
		return modelNumber;
	}

	public void setProductType(String productType){
		this.productType = productType;
	}

	public String getProductType(){
		return productType;
	}

	@Override
 	public String toString(){
		return 
			"Info{" + 
			"departmentName = '" + departmentName + '\'' + 
			",departmentUrl = '" + departmentUrl + '\'' + 
			",productLabel = '" + productLabel + '\'' + 
			",brandName = '" + brandName + '\'' + 
			",imageId = '" + imageId + '\'' + 
			",departmentId = '" + departmentId + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",storeSkuNumber = '" + storeSkuNumber + '\'' + 
			",modelNumber = '" + modelNumber + '\'' + 
			",productType = '" + productType + '\'' + 
			"}";
		}
}