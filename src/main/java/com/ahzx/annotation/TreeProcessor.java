package com.ahzx.annotation;

import java.lang.reflect.Method;

/**
 * @author think
 * @version 1.0
 * @date 2021/12/7 7:51
 * 自定义注解
 * 通过反射调用注解的方法
 */
public class TreeProcessor {
    public void parseMethod(final Class<?> clazz) throws Exception {
        final Object obj = clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
        final Method[] methods = clazz.getDeclaredMethods();
        for(final Method method:methods){
            final Tree myTree = method.getAnnotation(Tree.class);
            if(myTree!=null){
                method.invoke(obj, myTree.name());
            }
        }
    }
}
