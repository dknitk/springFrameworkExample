package com.kw.spring_core.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kw/spring_core/ref/config.xml");
		Student student1 = context.getBean("st1", Student.class);
		System.out.println(student1.getId());
		System.out.println(student1.getName());
		System.out.println(student1.getAddress().getId());
		System.out.println(student1.getAddress().getCity());
		
	}

}
