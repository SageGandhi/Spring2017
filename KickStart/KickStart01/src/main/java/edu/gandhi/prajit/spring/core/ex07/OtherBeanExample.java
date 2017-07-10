package edu.gandhi.prajit.spring.core.ex07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OtherBeanExample {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext05.xml");){
			System.out.println(context.getBean("configOverride"));
			System.out.println(context.getBean("configDefault"));
			context.registerShutdownHook();
		}
	}
}
