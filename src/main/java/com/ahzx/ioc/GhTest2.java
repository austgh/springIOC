package com.ahzx.ioc;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GhTest2 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //get set 方法
        GhController ghController=new GhController();
        Class<? extends GhController> aClass = ghController.getClass();
        //获取属性
        Field ghService1 = aClass.getDeclaredField("ghService");
        ghService1.setAccessible(true);
        GhService ghService=new GhService();
        String name=ghService1.getName();
        System.out.println("name:"+name);
        //拼接方法名
        String methodName="set"+name.substring(0,1).toUpperCase()+name.substring(1);
        System.out.println("methodName："+methodName);
        //利用反射方式处理
        Method method = aClass.getDeclaredMethod(methodName, GhService.class);
        method.invoke(ghController,ghService);
        System.out.println(ghController.getGhService());
    }
}
