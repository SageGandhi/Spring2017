package edu.gandhi.prajit.spring.pattern.ex01;

public interface MessageProvider {
	default String getMessage(){
		return "Spring Framework!!";
	}
}
