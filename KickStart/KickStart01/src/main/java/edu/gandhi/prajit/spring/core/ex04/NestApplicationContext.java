package edu.gandhi.prajit.spring.core.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NestApplicationContext {
	public static void main(String[] args) {
		final ApplicationContext parentContext=new ClassPathXmlApplicationContext("AppContext02Ex03.xml");
		System.out.println("Parent"+parentContext.getBean("source"));
		try(final GenericXmlApplicationContext childContext=new GenericXmlApplicationContext();){
			childContext.load("ApplicationContext01.xml");
			childContext.setParent(parentContext);
			childContext.refresh();
			
			System.out.println("Child"+childContext.getBean("source"));
			System.out.println("Child"+childContext.getBean("constructorByType01"));
		}		
	}
}
