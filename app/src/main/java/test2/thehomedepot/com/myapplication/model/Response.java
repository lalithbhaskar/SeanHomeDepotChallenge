package test2.thehomedepot.com.myapplication.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("skus")
	private List<SkusItem> skus;

	@SerializedName("source")
	private String source;

	@SerializedName("searchReport")
	private SearchReport searchReport;

	public void setSkus(List<SkusItem> skus){
		this.skus = skus;
	}

	public List<SkusItem> getSkus(){
		return skus;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setSearchReport(SearchReport searchReport){
		this.searchReport = searchReport;
	}

	public SearchReport getSearchReport(){
		return searchReport;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"skus = '" + skus + '\'' + 
			",source = '" + source + '\'' + 
			",searchReport = '" + searchReport + '\'' + 
			"}";
		}
}