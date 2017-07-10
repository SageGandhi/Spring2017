package edu.gandhi.prajit.spring.pattern.ex01;

import org.springframework.stereotype.Component;

@Component("defaultMessageProvider")
public class DefaultMessageProvider implements MessageProvider {
	@Override
	public String getMessage() {
		return "Welcome To Spring Framework Core";
	}
}
