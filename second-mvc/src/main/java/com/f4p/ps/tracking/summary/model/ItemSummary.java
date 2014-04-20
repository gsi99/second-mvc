package com.f4p.ps.tracking.summary.model;

public class ItemSummary {
	
	ProductCode productCode;
	String productNameString;
	int itemCount;
	String itemStatus;
	String subStatus;
	
	public ProductCode getProductCode() {
		return productCode;
	}
	public void setProductCode(ProductCode productCode) {
		this.productCode = productCode;
	}
	public String getProductNameString() {
		return productNameString;
	}
	public void setProductNameString(String productNameString) {
		this.productNameString = productNameString;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public String getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

}
