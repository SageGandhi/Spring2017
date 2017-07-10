package edu.gandhi.prajit.spring.pattern.ex01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("defaultMessageRenderer")
public class DefaultMessageRenderer implements MessageRenderer {
	
	@Autowired
	@Qualifier("defaultMessageProvider")
	private MessageProvider provider;
	
	@Override
	public void render() {
		System.out.println(getMessageProvider().getMessage());
	}
	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;

	}

	@Override
	public MessageProvider getMessageProvider() {
		return provider;
	}

}
