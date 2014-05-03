package com.f4p.ps.ppandc.dashboard.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.f4p.ps.tracking.summary.adaptor.TrackingAdaptor;
import com.f4p.ps.tracking.summary.model.CustomerItemSummary;


@Controller  
public class SummaryController {
	
	@Autowired
	TrackingAdaptor trackingAdapter;
	
    //String message = "Welcome to Summary Controller";  
    
    @RequestMapping("/summary")  
    public ModelAndView showMessage() {  
        System.out.println("from summary controller");
        
        CustomerItemSummary aMessage = trackingAdapter.getCustomerItemSummaryModel();
        return new ModelAndView("summary", "message", aMessage);  
    }

    @RequestMapping("/secondSummary")  
    public ModelAndView showSecondMessage() {  
        System.out.println("from second summary controller");
        
        String aMessage = trackingAdapter.getCustomerItemSummarys();
        return new ModelAndView("secondSummary", "message", aMessage);  
    }
}
