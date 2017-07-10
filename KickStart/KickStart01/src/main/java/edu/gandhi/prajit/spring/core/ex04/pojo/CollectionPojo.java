package edu.gandhi.prajit.spring.core.ex04.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CollectionPojo {
	private Map<String, String> map;
	private List<String> list;
	private Set<String> set;
	private Properties props;
}
