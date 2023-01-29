package com.ahzx.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;
/**
 * 
 * Aware 回调
 *	如何获取容器中Bean的name
 * @author think
 */
@Component
public class User implements BeanNameAware{

	private String bean1Name;
	public String getBean1Name() {
		return bean1Name;
	}
	public void setBean1Name(String bean1Name) {
		this.bean1Name = bean1Name;
	}
	/**
	 * 获取Bean 的名字
	 */
	@Override
	public void setBeanName(String paramString) {
		this.bean1Name=paramString;
	}
}
