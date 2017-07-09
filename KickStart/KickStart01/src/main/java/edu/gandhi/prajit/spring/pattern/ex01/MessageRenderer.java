package edu.gandhi.prajit.spring.pattern.ex01;

public interface MessageRenderer {
	default void render(){
		if(getMessageProvider()==null){
			throw new RuntimeException(
					"You Must Set The Property messageProvider Of Class:"
					+ MessageProvider.class.getName());
		}
		System.out.println(getMessageProvider().getMessage());
	}
	void setMessageProvider(MessageProvider provider);
	MessageProvider getMessageProvider();
}
