package com.ahzx.util;

import com.ahzx.service.A;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * FactoryBean.getObject 可以手动向容器中添加Bean
 * @author think
 */
@Slf4j
@Component
public class LubanFactoryBean implements FactoryBean {

	@Override
	public Object getObject(){
		log.info("只调用了一次!");
		return new A();
	}

	@Override
	public Class getObjectType() {
		return A.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
