package com.kw.aop;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	public Object getEmployeeById(Integer empId) {
		try {
			Thread.sleep(new Random().nextInt(2000));
		}catch(InterruptedException exception) {
			LOGGER.error("ERROR occurred in business Service : {}",exception.getMessage());
		}
		return empId;
	}
}
