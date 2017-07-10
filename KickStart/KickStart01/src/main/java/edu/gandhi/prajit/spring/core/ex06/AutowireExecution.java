package edu.gandhi.prajit.spring.core.ex06;

import java.text.MessageFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireExecution {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext04.xml");){
			System.out.println("autoWireByName:"+context.getBean("autoWireByName",AutoWireExample.class).getOla());
			System.out.println("autoWireByName:"+context.getBean("autoWireByName",AutoWireExample.class).getUber());
			System.out.println("autoWireByType:"+context.getBean("autoWireByType",AutoWireExample.class).getOla());
			System.out.println("autoWireByType:"+context.getBean("autoWireByType",AutoWireExample.class).getUber());
			System.out.println("autoWireByConstructor:"+context.getBean("autoWireByConstructor",AutoWireExample.class).getOla());
			System.out.println("autoWireByConstructor:"+context.getBean("autoWireByConstructor",AutoWireExample.class).getUber());
			System.out.println("autoWireByDefault:"+context.getBean("autoWireByDefault",AutoWireExample.class).getOla());
			System.out.println("autoWireByDefault:"+context.getBean("autoWireByDefault",AutoWireExample.class).getUber());
			System.out.println("autoWireNo:"+context.getBean("autoWireNo",AutoWireExample.class).getOla());
			System.out.println("autoWireNo:"+context.getBean("autoWireNo",AutoWireExample.class).getUber());
			for(String alias:context.getAliases("Uber")){
				System.out.println(MessageFormat.format("Uber Alias Name:{0},Class Name:{1}",alias,context.getBean(alias).getClass().getName()));
			}
			for(String alias:context.getAliases("Ola")){
				System.out.println(MessageFormat.format("Ola Alias Name:{0},Class Name:{1}",alias,context.getBean(alias).getClass().getName()));
			}
		}
	}
}
