package edu.gandhi.prajit.spring.core.ex02;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import edu.gandhi.prajit.spring.pattern.diioc.ProductService;
import edu.gandhi.prajit.spring.pattern.ex01.MessageRenderer;

public class SpringBootStrapperBeanFactory01 {
	public static void main(String[] args) {
		final DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		final XmlBeanDefinitionReader xmlBeanDefinitionReader=new XmlBeanDefinitionReader(factory);
		xmlBeanDefinitionReader.loadBeanDefinitions("ApplicationContext00.xml");
		
		//Dependency Lookup
		System.out.println(factory.getBean("productServiceViaSetter",ProductService.class).getProductByName("Sweet"));//Example 01
		System.out.println(factory.getBean("productServiceViaConstructor",ProductService.class).getProductByName("Sweet"));//Example 01
		//Dependency Lookup
		factory.getBean("defaultMessageRenderer",MessageRenderer.class).render();//Example 02
		factory.getBean("defaultMessageRendererUsingRef",MessageRenderer.class).render();//Example 02
	}
}
