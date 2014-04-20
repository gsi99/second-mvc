package com.f4p.ps.tracking.summary.model;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerItemSummary {
	
	String accountNumber;
	String accountName;

	Collection<ItemSummary> itemSummary; 
	
	DeliveryDay deliveryDay;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Collection<ItemSummary> getItemSummary() {
		return itemSummary;
	}

	public DeliveryDay getDeliveryDay() {
		return deliveryDay;
	}

	public void setDeliveryDay(DeliveryDay deliveryDay) {
		this.deliveryDay = deliveryDay;
	}

	public void addItemSummary(ItemSummary newItemSummary) {

		if (itemSummary == null) {
			itemSummary = new ArrayList<ItemSummary>();
		} 
		
		itemSummary.add(newItemSummary);
	}
}
