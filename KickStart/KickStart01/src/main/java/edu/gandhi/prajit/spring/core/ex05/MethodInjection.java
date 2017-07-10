package edu.gandhi.prajit.spring.core.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodInjection {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext03.xml");
		System.out.println(context.getBean("prototypeBeanAbstract",SingletonBeanAbstract.class));
		System.out.println(context.getBean("prototypeBeanAbstract",SingletonBeanAbstract.class).getPrototypeBean());
		
		System.out.println(context.getBean("prototypeBeanAbstract",SingletonBeanAbstract.class));
		System.out.println(context.getBean("prototypeBeanAbstract",SingletonBeanAbstract.class).getPrototypeBean());
		
		System.out.println(context.getBean("prototypeBeanAbstract",SingletonBeanAbstract.class));
		System.out.println(context.getBean("prototypeBeanAbstract",SingletonBeanAbstract.class).getPrototypeBean());
		((ClassPathXmlApplicationContext)context).close();		
	}
}
