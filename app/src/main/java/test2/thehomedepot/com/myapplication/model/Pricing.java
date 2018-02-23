package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Pricing{

	@SerializedName("uom")
	private String uom;

	@SerializedName("originalPrice")
	private double originalPrice;

	@SerializedName("dollarOff")
	private int dollarOff;

	@SerializedName("lowerPrice")
	private boolean lowerPrice;

	@SerializedName("alternatePriceDisplay")
	private boolean alternatePriceDisplay;

	@SerializedName("percentageOff")
	private int percentageOff;

	@SerializedName("specialPrice")
	private double specialPrice;

	@SerializedName("unitsPerCase")
	private String unitsPerCase;

	public void setUom(String uom){
		this.uom = uom;
	}

	public String getUom(){
		return uom;
	}

	public void setOriginalPrice(double originalPrice){
		this.originalPrice = originalPrice;
	}

	public double getOriginalPrice(){
		return originalPrice;
	}

	public void setDollarOff(int dollarOff){
		this.dollarOff = dollarOff;
	}

	public int getDollarOff(){
		return dollarOff;
	}

	public void setLowerPrice(boolean lowerPrice){
		this.lowerPrice = lowerPrice;
	}

	public boolean isLowerPrice(){
		return lowerPrice;
	}

	public void setAlternatePriceDisplay(boolean alternatePriceDisplay){
		this.alternatePriceDisplay = alternatePriceDisplay;
	}

	public boolean isAlternatePriceDisplay(){
		return alternatePriceDisplay;
	}

	public void setPercentageOff(int percentageOff){
		this.percentageOff = percentageOff;
	}

	public int getPercentageOff(){
		return percentageOff;
	}

	public void setSpecialPrice(double specialPrice){
		this.specialPrice = specialPrice;
	}

	public double getSpecialPrice(){
		return specialPrice;
	}

	public void setUnitsPerCase(String unitsPerCase){
		this.unitsPerCase = unitsPerCase;
	}

	public String getUnitsPerCase(){
		return unitsPerCase;
	}

	@Override
 	public String toString(){
		return 
			"Pricing{" + 
			"uom = '" + uom + '\'' + 
			",originalPrice = '" + originalPrice + '\'' + 
			",dollarOff = '" + dollarOff + '\'' + 
			",lowerPrice = '" + lowerPrice + '\'' + 
			",alternatePriceDisplay = '" + alternatePriceDisplay + '\'' + 
			",percentageOff = '" + percentageOff + '\'' + 
			",specialPrice = '" + specialPrice + '\'' + 
			",unitsPerCase = '" + unitsPerCase + '\'' + 
			"}";
		}
}