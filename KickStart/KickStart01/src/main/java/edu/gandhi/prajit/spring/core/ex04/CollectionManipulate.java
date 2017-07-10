package edu.gandhi.prajit.spring.core.ex04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionManipulate {
	public static void main(String[] args) {
		try (final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext02.xml");) {
			System.out.println("Parent" + context.getBean("collect"));
		}
	}
}