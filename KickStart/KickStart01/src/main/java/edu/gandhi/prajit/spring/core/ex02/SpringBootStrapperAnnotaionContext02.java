package edu.gandhi.prajit.spring.core.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.gandhi.prajit.spring.core.ex02.config.AnnotationBasedConfiguration;
import edu.gandhi.prajit.spring.core.ex02.service.ProdcutServiceAutowiredApplied;
import edu.gandhi.prajit.spring.pattern.diioc.ProductService;
import edu.gandhi.prajit.spring.pattern.ex01.MessageRenderer;

public class SpringBootStrapperAnnotaionContext02 {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AnnotationBasedConfiguration.class);
		//Dependency Lookup
		System.out.println(context.getBean("productServiceViaSetter",ProductService.class).getProductByName("Sweet"));//Example 01
		System.out.println(context.getBean("productServiceViaConstructor",ProductService.class).getProductByName("Sweet"));//Example 01
		System.out.println(context.getBean("prodcutServiceAutowiredApplied",ProdcutServiceAutowiredApplied.class).getProductByName("Sweet"));//Example 01
		//Dependency Lookup
		context.getBean("defaultMessageRenderer",MessageRenderer.class).render();//Example 02
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
