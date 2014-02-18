package com.f4p.ps.ppandc.dashboard.service;

import java.util.HashMap;
import java.util.Map;

public class PreadviceService {

	public Object getPreadviceAnalytics() {
		Map<String, Object> analytics = new HashMap<String, Object>();
		analytics.put("postcode", "{postcode=EX12VW, value=10}");
		return analytics;
	}

}
