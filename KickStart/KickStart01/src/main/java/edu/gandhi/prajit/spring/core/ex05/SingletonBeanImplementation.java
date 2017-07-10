package edu.gandhi.prajit.spring.core.ex05;

public class SingletonBeanImplementation{
	private PrototypeBeanClass prototypeBean;  
	
	/**
	 * @return the prototypeBean
	 */
	public PrototypeBeanClass getPrototypeBean() {
		return prototypeBean;
	}

	/**
	 * @param prototypeBean the prototypeBean to set
	 */
	public void setPrototypeBean(PrototypeBeanClass prototypeBean) {
		this.prototypeBean = prototypeBean;
	}

	public void doThreadUnsafeWorkBySingleton() {
		getPrototypeBean().doThreadsafeWork();
	}
}
