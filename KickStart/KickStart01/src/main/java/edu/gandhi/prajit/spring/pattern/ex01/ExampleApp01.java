package edu.gandhi.prajit.spring.pattern.ex01;

public class ExampleApp01 {
	public static void main(String[] args) {
		//Glue Code:Start
		MessageProvider provider=DefaultMessageSupportFactory.getInstance().getMessageProvider();
		MessageRenderer renderer=DefaultMessageSupportFactory.getInstance().getMessageRenderer();
		renderer.setMessageProvider(provider);
		//Glue Code:End
		//Actual Business Logic:Start
		renderer.render();
		//Actual Business Logic:End		
	}
}
