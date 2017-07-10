package edu.gandhi.prajit.spring.batch.ex01;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class TitanicPassengerDetails {
	private int passengerId;
	private int survived;
	private int Pclass;
	private String name;
	private String sex;
	private int age;
	private int sibSp;
	private int parch;
	private String ticket;
	private double fare;
	private String cabin;
	private String embarked; 
}
