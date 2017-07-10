package edu.gandhi.prajit.spring.core.ex05;

public abstract class SingletonBeanAbstract{

	public abstract PrototypeBeanClass getPrototypeBean();

	public void doThreadUnsafeWorkBySingleton() {
		getPrototypeBean().doThreadsafeWork();
	}

}
