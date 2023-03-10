package com.ahzx.util;

import com.ahzx.entity.GhDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 
 * ImportBeanDefinitionRegistrar 该接口可以批量实现Bean
 * LubanBeanDefinitionRegistrar 类上不需要成为组件
 * @author think
 */
@Slf4j
public class LubanBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
		//扫描
		
//		List<Class> mappers=new ArrayList<>();
//		mappers.add(OrderMapper.class);
//		mappers.add(UserMapper.class);
//		
//		for(Class mapper:mappers){
//			AbstractBeanDefinition beanDefinition=BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//			beanDefinition.setBeanClass(LubanFactoryBean.class);
//			beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(mapper);
//			registry.registerBeanDefinition(mapper.getName(), beanDefinition);
//		}
//		模拟mybatis mapper 接口
//		AbstractBeanDefinition beanDefinition1=BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition1.setBeanClass(LubanFactoryBean.class);
//		beanDefinition1.getConstructorArgumentValues().addGenericArgumentValue(OrderMapper.class);
//		registry.registerBeanDefinition("orderMapper", beanDefinition1);

		AbstractBeanDefinition definition = new RootBeanDefinition();
		definition.setBeanClass(GhDemo.class);
		/**
		 * 调用BD的构造方法 参数是definition.getBeanClassName()
		 */
		String name="gonghe";
		log.info(definition.getBeanClassName());
		//调用构造函数
		definition.getConstructorArgumentValues().addGenericArgumentValue(name);
		//注册BD
		registry.registerBeanDefinition("ghDemo", definition);
	}

}
