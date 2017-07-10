package edu.gandhi.prajit.spring.core.ex11;

import org.springframework.context.ApplicationListener;

public class EmployeeJoinedToProjectEventListener implements ApplicationListener<EmployeeJoinedToProjectEvent> {
	@Override
	public void onApplicationEvent(EmployeeJoinedToProjectEvent event) {
		System.out.println("Received :" + event.getSource());
		System.out.println("Received ExtraMessage:" + event.getExtraMessage());
	}
}
