package edu.gandhi.prajit.spring.core.ex09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPropertyExecutor {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext09.xml");){
			System.out.println(applicationContext.getBean(PropertyEditorBean.class));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}