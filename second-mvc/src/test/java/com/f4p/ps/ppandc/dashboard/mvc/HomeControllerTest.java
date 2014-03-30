package com.f4p.ps.ppandc.dashboard.mvc;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.f4p.ps.ppandc.dashboard.service.PreadviceService;

import static org.mockito.Mockito.*;

public class HomeControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShowPreadviceDetails() {
		PreadviceService pSvce = mock(PreadviceService.class);
		// PreadviceService pSvce = new PreadviceService();
		Map<String, Object> analytics = new HashMap<String, Object>();
		analytics.put("postcode", "{postcode=EX12VW, value=10}");
		
		when(pSvce.getPreadviceAnalytics()).thenReturn(analytics);
		
		HomeController controller = 
				new HomeController(pSvce);
		
		Map<String, Object> model = new HashMap<String, Object>();
		String viewName = controller.showPreadviceDetails(model);
		
		assertEquals("preadvice", viewName);
		
		assertSame(analytics, model.get("analytics"));
}

}
