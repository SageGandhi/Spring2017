package edu.gandhi.prajit.spring.core.ex11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListenerEventExecutor {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext11.xml");){
			
			applicationContext.getBean("managerPublisher",ManagerPublisher.class).publishNewEmployeeJoined(Employee.builder()
				.name("Prajit Gandhi").project("ProofOfConcept").build(),"UlallaUlalla..");
			
			applicationContext.getBean("managerPublisher",ManagerPublisher.class).publishNewEmployeeJoined(Employee.builder()
					.name("Swagat Srichandan").project("ProofOfConcept").build(),"Cómo estás hoy?");
		}
	}
}
