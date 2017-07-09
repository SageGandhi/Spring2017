package edu.gandhi.prajit.spring.pattern.ex01;

public class DefaultMessageProvider implements MessageProvider {
	@Override
	public String getMessage() {
		return "Default Message";
	}
}
