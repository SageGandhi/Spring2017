package edu.gandhi.prajit.spring.core.ex09;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomUtilDatePropertyRegistrar extends PropertyEditorSupport implements PropertyEditorRegistrar {
	private String format;

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Date.class, new CustomDateEditor(
			new SimpleDateFormat(this.format), true));		
	}
}
