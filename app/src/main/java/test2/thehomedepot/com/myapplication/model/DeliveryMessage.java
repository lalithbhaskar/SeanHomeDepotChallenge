package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class DeliveryMessage{

	@SerializedName("sameDayDeliveryMessage")
	private String sameDayDeliveryMessage;

	public void setSameDayDeliveryMessage(String sameDayDeliveryMessage){
		this.sameDayDeliveryMessage = sameDayDeliveryMessage;
	}

	public String getSameDayDeliveryMessage(){
		return sameDayDeliveryMessage;
	}

	@Override
 	public String toString(){
		return 
			"DeliveryMessage{" + 
			"sameDayDeliveryMessage = '" + sameDayDeliveryMessage + '\'' + 
			"}";
		}
}