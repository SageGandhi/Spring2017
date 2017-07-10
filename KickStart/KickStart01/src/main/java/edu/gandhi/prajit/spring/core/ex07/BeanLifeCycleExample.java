package edu.gandhi.prajit.spring.core.ex07;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeanLifeCycleExample
		implements InitializingBean, DisposableBean, BeanFactoryAware, BeanNameAware, ApplicationContextAware {
	private String dummyProperty;
	private ConfigData config;
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean::destroy");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean::afterPropertiesSet");
	}

	public BeanLifeCycleExample() {
		System.out.println("BeanLifeCycleExample::Constructor");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware::setBeanFactory::" + beanFactory);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware::setBeanName::" + name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware::setApplicationContext::" + applicationContext);
	}
	public void initMethod(){
		System.out.println("initMethod::Custom");
	}
	public void destroyMethod(){
		System.out.println("destroyMethod::Custom");
	}
	@PostConstruct
	public void initMethodPostConstruct(){
		System.out.println("initMethodPostConstruct::@PostConstruct");
	}
	@PreDestroy
	public void destroyMethodPreDestroy(){
		System.out.println("destroyMethodPreDestroy::@PreDestroy");
	}
}