package edu.gandhi.prajit.spring.core.ex03.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component("valueAnnotated")
public class BeanPropertyCopy01 {
	@Value("#{target.stringProperty01}")
	private String stringProperty01;
	@Value("#{target.intProperty01}")
	private int intProperty01;
	@Value("#{target.floatProperty01}")
	private float floatProperty01;
	@Value("#{target.booleanProperty01}")
	private boolean booleanProperty01;
	@Value("#{target.longProperty01}")
	private Long longProperty01;
}
