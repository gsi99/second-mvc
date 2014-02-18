package com.f4p.ps.ppandc.dashboard.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.f4p.ps.ppandc.dashboard.service.PreadviceService;

import javax.inject.Inject;

@Controller
public class HomeController {

	private PreadviceService preadviceSvce;
	
	@Inject
	public HomeController (PreadviceService preadviceService) {
		this.preadviceSvce = preadviceService;
	}
	
	@RequestMapping({"/", "/preadvice"})
	public String showPreadviceDetails(Map<String, Object> model) {
		
		model.put("analytics", preadviceSvce.getPreadviceAnalytics());
		
		return "preadvice";
	}
}
