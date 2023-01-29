package com.ahzx.ioc;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class GhIOC {

	public static void main(String[] args) throws Exception  {
		//模拟从容器中获取对象
		GhController ghController = new GhController();
		//获取ghController的属性值
		final Class<? extends GhController> controllerClass = ghController.getClass();
		Stream.of(controllerClass.getDeclaredFields()).forEach(field->{
			field.setAccessible(true);
			if (field.getAnnotation(GhAnnotation.class) != null) {
				//获取属性的类型
				Class fieldType = field.getType();
				// 使用反射来实例化对象
				try {
					Object instance = fieldType.newInstance();
					field.set(ghController, instance);
					// 反射调用属性set方法
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		log.info(ghController.getGhService().toString());
	}
}
