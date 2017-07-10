package edu.gandhi.prajit.spring.core.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.gandhi.prajit.spring.core.ex03.pojo.BeanPropertyCopy00;
import edu.gandhi.prajit.spring.core.ex03.pojo.BeanPropertyCopy01;

public class BeanPropertyCopy {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AppContext02Ex03.xml");
		System.out.println(context.getBean(BeanPropertyCopy00.class));
		System.out.println(context.getBean("target",BeanPropertyCopy01.class));
		System.out.println(context.getBeansOfType(BeanPropertyCopy01.class).get("valueAnnotated"));
		System.out.println(context.getBeansOfType(BeanPropertyCopy01.class).get("valueXml"));
		((ClassPathXmlApplicationContext)context).close();
	}
}
