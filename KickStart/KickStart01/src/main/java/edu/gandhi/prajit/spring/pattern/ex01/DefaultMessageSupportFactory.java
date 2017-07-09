package edu.gandhi.prajit.spring.pattern.ex01;

import java.io.IOException;
import java.util.Properties;

public class DefaultMessageSupportFactory {
	private static DefaultMessageSupportFactory instance = new DefaultMessageSupportFactory();
	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;

	private DefaultMessageSupportFactory() {
		props = new Properties();
		try {
			props.load(getClass().getResourceAsStream("PropEx01.properties"));//In Same Package
			renderer = (MessageRenderer) Class.forName(props.getProperty("msg.render.class")).newInstance();
			provider = (MessageProvider) Class.forName(props.getProperty("msg.provider.class")).newInstance();
		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException ioException) {
			ioException.printStackTrace();
		}
	}

	public static DefaultMessageSupportFactory getInstance() {
		return instance;
	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}
}
