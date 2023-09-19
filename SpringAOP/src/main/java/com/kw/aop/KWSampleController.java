package com.kw.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class KWSampleController {
	Logger logger = LoggerFactory.getLogger(KWSampleController.class);
	
	@GetMapping("/hc")
	public String healthCheck() {
	
		logger.info("Inside Health Check Method:::");
		String str = null;
		//str.toString();
		return "Hello";
	}

}
