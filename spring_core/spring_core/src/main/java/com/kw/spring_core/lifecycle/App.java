package com.kw.spring_core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new  ClassPathXmlApplicationContext(
				"com/kw/spring_core/lifecycle/config.xml");
		Student student = context.getBean("st1", Student.class);
		context.registerShutdownHook();
		System.out.println(student);
	}
}
