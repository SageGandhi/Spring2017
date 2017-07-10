package edu.gandhi.prajit.spring.core.ex07;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConfigData {
	public String configUrl;
	public String configUser;
	public String configPassword;
	public String configDbSchema;
}