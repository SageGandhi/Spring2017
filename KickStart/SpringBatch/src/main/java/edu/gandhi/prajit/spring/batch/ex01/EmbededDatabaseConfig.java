package edu.gandhi.prajit.spring.batch.ex01;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class EmbededDatabaseConfig {
	@Bean public DataSource hsqlDataSource() {
		return new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.HSQL)
			.addScript("Ex01/Hsql/CreateScript.sql")
			.addScript("Ex01/Hsql/InsertScript.sql")
			.build();
	}
	@Bean public DataSource h2DataSource() {
		return new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.H2)
			.addScript("Ex01/H2/CreateScript.sql")
			.addScript("Ex01/H2/InsertScript.sql")
			.build();
	}
	@Bean public DataSource derbyDataSource() {
		return new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.DERBY)
			.addScript("Ex01/Derby/CreateScript.sql")
			.addScript("Ex01/Derby/InsertScript.sql")
			.build();
	}
	@Bean public JdbcTemplate h2JdbcTemplate(){
		return new JdbcTemplate(h2DataSource());
	}
	@Bean public JdbcTemplate hsqlJdbcTemplate(){
		return new JdbcTemplate(hsqlDataSource());
	}
	@Bean public JdbcTemplate derbyJdbcTemplate(){
		return new JdbcTemplate(derbyDataSource());
	}	
}
