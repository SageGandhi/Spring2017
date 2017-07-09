package edu.gandhi.prajit.thymeleaf.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {
	private String welcomeMsg;
	private String name;
	private String emailId;
	private boolean admin;
}