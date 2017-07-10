package edu.gandhi.prajit.spring.core.ex06;

import java.text.MessageFormat;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AutoWireExample {
	private Uber uber;
	private Ola ola;

	/**
	 * @return the uber
	 */
	public Uber getUber() {
		return uber;
	}

	/**
	 * @param uber
	 *            the uber to set
	 */
	public void setUber(Uber uber) {
		System.out.println(MessageFormat.format("public void setUber(Uber {0})", uber));
		this.uber = uber;
	}

	/**
	 * @return the ola
	 */
	public Ola getOla() {
		return ola;
	}

	/**
	 * @param ola
	 *            the ola to set
	 */
	public void setOla(Ola ola) {
		System.out.println(MessageFormat.format("public void setOla(Ola {0})", ola));
		this.ola = ola;
	}

	/**
	 * @param uber
	 * @param ola
	 */
	public AutoWireExample(Uber uber, Ola ola) {
		System.out.println(MessageFormat.format("public AutoWireExample(Uber {0}, Ola {1})", uber, ola));
		this.uber = uber;
		this.ola = ola;
	}

	/**
	 * @param uber
	 */
	public AutoWireExample(Uber uber) {
		System.out.println(MessageFormat.format("public AutoWireExample(Uber {0})", uber));
		this.uber = uber;
	}

	/**
	 * @param ola
	 */
	public AutoWireExample(Ola ola) {
		System.out.println(MessageFormat.format("public AutoWireExample(Ola {0})", ola));
		this.ola = ola;
	}
}