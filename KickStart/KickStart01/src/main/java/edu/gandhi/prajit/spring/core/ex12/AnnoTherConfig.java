package edu.gandhi.prajit.spring.core.ex12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
/**<context:property-placeholder location="classpath:PropEx12/DbProperty.properties"/>*/
@PropertySource(value="classpath:PropEx12/DbProperty.properties")
/**<context:component-scan base-package="edu.gandhi.prajit.spring.core.ex12"></context:component-scan>*/
@ComponentScan(basePackages={"edu.gandhi.prajit.spring.core.ex12"})
public class AnnoTherConfig {
	@Autowired Environment environment;
	
	@Bean(name="dbBeanPrototype")
	@Scope(value="prototype")
	public DbBean dbBeanPrototype(
			@Value("${Db.Url}")String dbUrl,
			@Value("${Db.User}")String dbUser,
			@Value("${Db.Password}")String dbPassWord
		){
		return DbBean.builder().dbUrl(dbUrl).dbPassWord(dbPassWord).dbUser(dbUser).build();
	}
	
	@Bean 
	PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
}
