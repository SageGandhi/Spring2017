package edu.gandhi.prajit.spring.core.ex10;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageSourceExecutor {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext10.xml");){
			System.out.println(applicationContext.getMessage("Spring.Welcome",new Object[]{"4.3.9.RELEASE"},Locale.US));
			System.out.println(applicationContext.getMessage("Spring.Welcome",new Object[]{"4.3.9.RELEASE"},new Locale("cz","CZ")));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}