package com.kw.spring_core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kw/spring_core/collection/config.xml");
		
		Student st1 = context.getBean("st1", Student.class);
		
		System.out.println(st1.getName());
		System.out.println(st1.getAddress());
		System.out.println(st1.getPhno());
		System.out.println(st1.getCourse());
	}

}
