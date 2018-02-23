package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class RatingsReviews{

	@SerializedName("totalReviews")
	private String totalReviews;

	@SerializedName("averageRating")
	private String averageRating;

	public void setTotalReviews(String totalReviews){
		this.totalReviews = totalReviews;
	}

	public String getTotalReviews(){
		return totalReviews;
	}

	public void setAverageRating(String averageRating){
		this.averageRating = averageRating;
	}

	public String getAverageRating(){
		return averageRating;
	}

	@Override
 	public String toString(){
		return 
			"RatingsReviews{" + 
			"totalReviews = '" + totalReviews + '\'' + 
			",averageRating = '" + averageRating + '\'' + 
			"}";
		}
}