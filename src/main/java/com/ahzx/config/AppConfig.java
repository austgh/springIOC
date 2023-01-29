package com.ahzx.config;

import com.ahzx.util.LubanBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *向spring中添加bean 有几种
 * @Bean
 * @Import
 *FactoryBean
 *Register
 * @Import(A.class) 如果A是普通的类，直接将A注入到容器中，如果A实现ImportBeanDefinitionRegistrar接口，则
 * 会调用registerBeanDefinitions方法
 * BeanFactoryPostProcessor.postProcessBeanFactory方法能向容器中注入单例
 */

@Configuration
@ComponentScan("com.ahzx")
@Import(LubanBeanDefinitionRegistrar.class)
// 根据A 生成Bean  如果是普通类 直接生成Bean  如果类实现了ImportBeanDefinitionRegistrar接口，会调用registerBeanDefinitions方法
public class AppConfig {

}
