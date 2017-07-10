package edu.gandhi.prajit.spring.core.ex11;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import lombok.Getter;
@Getter
public class ManagerPublisher implements ApplicationContextAware {
	private ApplicationContext applicationContext; 
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
	public void publishNewEmployeeJoined(Object args,String extraMessage){
		getApplicationContext().publishEvent(new EmployeeJoinedToProjectEvent(args,extraMessage));
	}
}
