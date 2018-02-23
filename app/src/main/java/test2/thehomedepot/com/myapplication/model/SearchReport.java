package test2.thehomedepot.com.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class SearchReport{

	@SerializedName("searchInterface")
	private String searchInterface;

	@SerializedName("startIndex")
	private int startIndex;

	@SerializedName("semanticProductName")
	private String semanticProductName;

	@SerializedName("totalProducts")
	private int totalProducts;

	@SerializedName("sortOrder")
	private String sortOrder;

	@SerializedName("pageSize")
	private int pageSize;

	@SerializedName("sortBy")
	private String sortBy;

	@SerializedName("keyword")
	private String keyword;

	public void setSearchInterface(String searchInterface){
		this.searchInterface = searchInterface;
	}

	public String getSearchInterface(){
		return searchInterface;
	}

	public void setStartIndex(int startIndex){
		this.startIndex = startIndex;
	}

	public int getStartIndex(){
		return startIndex;
	}

	public void setSemanticProductName(String semanticProductName){
		this.semanticProductName = semanticProductName;
	}

	public String getSemanticProductName(){
		return semanticProductName;
	}

	public void setTotalProducts(int totalProducts){
		this.totalProducts = totalProducts;
	}

	public int getTotalProducts(){
		return totalProducts;
	}

	public void setSortOrder(String sortOrder){
		this.sortOrder = sortOrder;
	}

	public String getSortOrder(){
		return sortOrder;
	}

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}

	public void setSortBy(String sortBy){
		this.sortBy = sortBy;
	}

	public String getSortBy(){
		return sortBy;
	}

	public void setKeyword(String keyword){
		this.keyword = keyword;
	}

	public String getKeyword(){
		return keyword;
	}

	@Override
 	public String toString(){
		return 
			"SearchReport{" + 
			"searchInterface = '" + searchInterface + '\'' + 
			",startIndex = '" + startIndex + '\'' + 
			",semanticProductName = '" + semanticProductName + '\'' + 
			",totalProducts = '" + totalProducts + '\'' + 
			",sortOrder = '" + sortOrder + '\'' + 
			",pageSize = '" + pageSize + '\'' + 
			",sortBy = '" + sortBy + '\'' + 
			",keyword = '" + keyword + '\'' + 
			"}";
		}
}