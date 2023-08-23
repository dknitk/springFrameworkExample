package com.kw.spring_core.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kw/spring_core/ci/config.xml");
		
		Student student = context.getBean("st1", Student.class);
		System.out.println(student.getId());
		System.out.println(student.getName());
	}
}
