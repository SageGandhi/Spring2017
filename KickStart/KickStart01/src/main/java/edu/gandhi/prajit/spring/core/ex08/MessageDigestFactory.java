package edu.gandhi.prajit.spring.core.ex08;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestFactory {
	private String cryptoAlgo = "MD5";
	/**
	 * @return the cryptoAlgo
	 */
	public String getCryptoAlgo() {
		return cryptoAlgo;
	}
	/**
	 * @param cryptoAlgo the cryptoAlgo to set
	 */
	public void setCryptoAlgo(String cryptoAlgo) {
		this.cryptoAlgo = cryptoAlgo;
	}
	public MessageDigest createInstance() throws NoSuchAlgorithmException{
		return MessageDigest.getInstance(cryptoAlgo);
	}
}
