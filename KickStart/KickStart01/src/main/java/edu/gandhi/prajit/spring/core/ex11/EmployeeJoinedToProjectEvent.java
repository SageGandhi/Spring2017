package edu.gandhi.prajit.spring.core.ex11;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeJoinedToProjectEvent extends ApplicationEvent {
	private static final long serialVersionUID = 6074792574858475076L;
	private String extraMessage;

	public EmployeeJoinedToProjectEvent(Object source, String extraMessage) {
		super(source);
		this.extraMessage = extraMessage;
		System.out.println("EmployeeJoinedToProjectEvent Generated Due To " + source + " With " + extraMessage);
	}
}
