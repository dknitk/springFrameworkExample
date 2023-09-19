package com.kw.aop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class LoggingAOPSpringBootTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	private EmployeeService employeeService;
	
	@Test
	public void testGetEmployeeById() {
		employeeService.getEmployeeById(123);
	}

}
