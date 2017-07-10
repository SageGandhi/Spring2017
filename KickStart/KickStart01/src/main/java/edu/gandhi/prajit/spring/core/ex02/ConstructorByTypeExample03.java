package edu.gandhi.prajit.spring.core.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorByTypeExample03 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext01.xml");
		((ClassPathXmlApplicationContext)context).close();
	}
}
