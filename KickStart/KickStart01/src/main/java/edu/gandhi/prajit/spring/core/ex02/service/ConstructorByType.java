package edu.gandhi.prajit.spring.core.ex02.service;

import org.springframework.beans.factory.annotation.Value;

public class ConstructorByType {
	private String intValInString;

	public ConstructorByType(@Value("1000")String intValInString) {
		System.out.println("ConstructorByType[String] Called"+intValInString);
		this.intValInString = intValInString;
	}
	public ConstructorByType(@Value("1000")int intValInString) {
		System.out.println("ConstructorByType[Int] Called"+intValInString);
		this.intValInString = String.valueOf(intValInString);
	}
	/**
	 * @return the intValInString
	 */
	public String getIntValInString() {
		return intValInString;
	}	
}
