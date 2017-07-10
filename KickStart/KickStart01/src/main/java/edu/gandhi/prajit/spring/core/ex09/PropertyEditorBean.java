package edu.gandhi.prajit.spring.core.ex09;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PropertyEditorBean {
	private byte[] bytes;
	private Class<?> clazz;
	private Boolean trueOrFalse;
	private List<String> stringList;
	private Date dateUtil;
	private Float floatValue;
	private File file;
	private InputStream inputStream;
	private Locale locale;
	private Pattern pattern;
	private Properties properties;
	private URL url;
}