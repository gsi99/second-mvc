package com.f4p.ps.ppandc.dashboard.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.f4p.ps.ppandc.dashboard.service.PreadviceService;

import javax.inject.Inject;

@Controller
public class HomeController {
	
	protected final Log logger = LogFactory.getLog(getClass());

	private PreadviceService preadviceSvce;
	
	@Inject
	public HomeController (PreadviceService preadviceService) {
		this.preadviceSvce = preadviceService;
	}
	
	@RequestMapping("/preadvice")
	public String showPreadviceDetails(Map<String, Object> model) {
		
		model.put("analytics", preadviceSvce.getPreadviceAnalytics());
		
		logger.info("Returning preadvice view");
		
		return "preadvice";
	}
}
