package edu.gandhi.prajit.spring.core.ex08;

import java.security.MessageDigest;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanImplementation implements FactoryBean<MessageDigest> {
	private String cryptoAlgo = "MD5";

	/**
	 * @return the cryptoAlgo
	 */
	public String getCryptoAlgo() {
		return cryptoAlgo;
	}

	/**
	 * @param cryptoAlgo
	 *            the cryptoAlgo to set
	 */
	public void setCryptoAlgo(String cryptoAlgo) {
		this.cryptoAlgo = cryptoAlgo;
	}

	@Override
	public MessageDigest getObject() throws Exception {
		return MessageDigest.getInstance(cryptoAlgo);
	}

	@Override
	public Class<?> getObjectType() {
		return MessageDigest.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
