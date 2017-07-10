package edu.gandhi.prajit.spring.core.ex12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyConfigExecutor {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext12.xml");){
			System.out.println(applicationContext.getBean("dbBean",DbBean.class));
		}
		try(AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AnnoTherConfig.class);){
			System.out.println(applicationContext.getBean("dbBeanPrototype",DbBean.class));
		}
	}
}
