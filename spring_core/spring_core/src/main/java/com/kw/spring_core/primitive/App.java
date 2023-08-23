package com.kw.spring_core.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/kw/spring_core/primitive/config.xml");
        System.out.println("Student-1");
        Student student1  = context.getBean("st1", Student.class);
        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
        
        System.out.println("Student-2");
        Student student2  = context.getBean("st2", Student.class);
        System.out.println(student2.getId());
        System.out.println(student2.getName());
        System.out.println(student2.getAddress());
        
        System.out.println("Student-3");
        Student student3  = context.getBean("st3", Student.class);
        System.out.println(student3.getId());
        System.out.println(student3.getName());
        System.out.println(student3.getAddress());
    }
}
