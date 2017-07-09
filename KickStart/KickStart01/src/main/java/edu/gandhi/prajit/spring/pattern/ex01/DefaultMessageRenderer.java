package edu.gandhi.prajit.spring.pattern.ex01;

public class DefaultMessageRenderer implements MessageRenderer {
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
