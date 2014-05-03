package com.f4p.ps.tracking.summary.adaptor;

import org.springframework.stereotype.Component;

import com.f4p.ps.tracking.summary.model.CustomerItemSummary;
import com.f4p.ps.tracking.summary.model.DeliveryDay;
import com.f4p.ps.tracking.summary.model.ItemSummary;
import com.f4p.ps.tracking.summary.model.ProductCode;
import com.google.gson.Gson;

@Component
public class TrackingAdaptorDummyImpl implements TrackingAdaptor {
	
	public String getCustomerItemSummarys() {
		
		CustomerItemSummary customerItemSummary = new CustomerItemSummary();
		
		customerItemSummary.setDeliveryDay(DeliveryDay.A);
		customerItemSummary.setAccountNumber("0063421344");
		customerItemSummary.setAccountName("Amazon DL");
		
		customerItemSummary.addItemSummary(createIemSummary(10, "Delivered", "", ProductCode.SPDL));
		customerItemSummary.addItemSummary(createIemSummary(15, "Collected", "", ProductCode.SPDL));
		customerItemSummary.addItemSummary(createIemSummary(23, "Processing", "", ProductCode.SPDL));
		
		customerItemSummary.addItemSummary(createIemSummary(11, "Delivered", "", ProductCode.RM24));
		customerItemSummary.addItemSummary(createIemSummary(12, "Collected", "", ProductCode.RM24));
		customerItemSummary.addItemSummary(createIemSummary(14, "Processing", "", ProductCode.RM24));
		
		customerItemSummary.addItemSummary(createIemSummary(2, "Delivered", "", ProductCode.RM48plus));
		customerItemSummary.addItemSummary(createIemSummary(23, "Collected", "", ProductCode.RM48plus));
		customerItemSummary.addItemSummary(createIemSummary(34, "Processing", "", ProductCode.RM48plus));
		
		Gson gson = new Gson();
		String json = gson.toJson(customerItemSummary);
		
		return json;
	}

	private ItemSummary createIemSummary(int count, String status, String subStatus, ProductCode productCode) {
		ItemSummary itemSummary = new ItemSummary();
		itemSummary.setItemCount(count);
		itemSummary.setItemStatus(status);
		itemSummary.setSubStatus(subStatus);
		itemSummary.setProductCode(productCode);
		
		return itemSummary;
	}

	public CustomerItemSummary getCustomerItemSummaryModel() {

		CustomerItemSummary customerItemSummary = new CustomerItemSummary();
		
		customerItemSummary.setDeliveryDay(DeliveryDay.A);
		customerItemSummary.setAccountNumber("0063421344");
		customerItemSummary.setAccountName("Amazon DL");
		
		customerItemSummary.addItemSummary(createIemSummary(10, "Delivered", "", ProductCode.SPDL));
		customerItemSummary.addItemSummary(createIemSummary(23, "Processing", "", ProductCode.SPDL));
		customerItemSummary.addItemSummary(createIemSummary(15, "Collected", "", ProductCode.SPDL));
		
		customerItemSummary.addItemSummary(createIemSummary(11, "Delivered", "", ProductCode.RM24));
		customerItemSummary.addItemSummary(createIemSummary(14, "Processing", "", ProductCode.RM24));
		customerItemSummary.addItemSummary(createIemSummary(12, "Collected", "", ProductCode.RM24));
		
		customerItemSummary.addItemSummary(createIemSummary(2, "Delivered", "", ProductCode.RM48plus));
		customerItemSummary.addItemSummary(createIemSummary(34, "Processing", "", ProductCode.RM48plus));
		customerItemSummary.addItemSummary(createIemSummary(23, "Collected", "", ProductCode.RM48plus));
		
		return customerItemSummary;
	}
}
