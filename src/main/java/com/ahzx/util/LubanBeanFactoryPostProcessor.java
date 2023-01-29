package com.ahzx.util;

import com.ahzx.entity.GhDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;
/**
 * @author think
 * Bean工厂后置处理器可以对BeanDefinition修改 包括修改BeanClass,从而达到偷天换日 也可以注册单例
 * BeanDefinitionRegistryPostProcessor 注册BeanDefinition
 * BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor
 */
@Component
@Slf4j
public class LubanBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition=(GenericBeanDefinition) beanFactory.getBeanDefinition("user");
		log.info(beanDefinition.getBeanClassName());
		//修改BeanDefinition的BeanClass属性为GhDemo,将来Bean的类型从User 变为GhDemo
		beanDefinition.setBeanClass(GhDemo.class);
		//向容器中注入单例
		beanFactory.registerSingleton("hello", new GhDemo("gh"));
	}

}
