package com.ustglobal.springcore.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorClass implements BeanPostProcessor {
@Override
public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("bean after intialization:"+beanName);
	return bean;
}

@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
	System.out.println("Bean before Intialiszation:"+beanName);
		return bean;
	}
}
