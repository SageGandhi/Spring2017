package edu.gandhi.prajit.spring.core.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.gandhi.prajit.spring.pattern.diioc.ProductService;
import edu.gandhi.prajit.spring.pattern.ex01.MessageRenderer;

public class SpringBootStrapperAppContext00 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext00.xml");
		//Dependency Lookup
		System.out.println(context.getBean("productServiceViaSetter",ProductService.class).getProductByName("Sweet"));//Example 01
		System.out.println(context.getBean("productServiceViaConstructor",ProductService.class).getProductByName("Sweet"));//Example 01
		//Dependency Lookup
		context.getBean("defaultMessageRenderer",MessageRenderer.class).render();//Example 02
		context.getBean("defaultMessageRendererUsingRef",MessageRenderer.class).render();//Example 02
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
