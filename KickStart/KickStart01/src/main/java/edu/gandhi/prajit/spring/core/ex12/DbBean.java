package edu.gandhi.prajit.spring.core.ex12;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DbBean {
	@Value("${Db.Url}")
	private String dbUrl;
	@Value("${Db.User}")
	private String dbUser;
	@Value("${Db.Password}")
	private String dbPassWord;
}
