package edu.gandhi.prajit.spring.core.ex08;

import java.security.MessageDigest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExecutor {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext08.xml");){
			System.out.println("Sha1:"+applicationContext.getBean("sha1MsgDigest",MessageDigest.class).digest("Welcome To Spring Core".getBytes()));
			System.out.println("Md5"+applicationContext.getBean("defaultMd5MsgDigest",MessageDigest.class).digest("Welcome To Spring Core".getBytes()));
			
			final FactoryBeanImplementation sha1FactoryBean=applicationContext.getBean("&sha1MsgDigest",FactoryBeanImplementation.class);
			System.out.println("Sha1:"+sha1FactoryBean.getObject().digest("Welcome To Spring Core".getBytes()));
			
			final FactoryBeanImplementation md5FactoryBean=applicationContext.getBean("&defaultMd5MsgDigest",FactoryBeanImplementation.class);
			System.out.println("Md5"+md5FactoryBean.getObject().digest("Welcome To Spring Core".getBytes()));
			
			System.out.println("Sha1:"+applicationContext.getBean("sha1",MessageDigest.class).digest("Welcome To Spring Core".getBytes()));
			System.out.println("Md5"+applicationContext.getBean("md5",MessageDigest.class).digest("Welcome To Spring Core".getBytes()));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}