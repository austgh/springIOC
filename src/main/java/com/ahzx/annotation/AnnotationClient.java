package com.ahzx.annotation;

/**
 * @author think
 * @version 1.0
 * @date 2021/12/7 7:58
 */
public class AnnotationClient {
    @Tree
    public static void sayHello(final String name){
        System.out.println("--->Hi," + name + "[sayHello]");
    }
    @Tree(name="SomeOne")
    public static void sayHello2SomeOne(final String name){
        System.out.println("--->Hi,"+name+"[sayHello2Someone]");
    }

    public static void main(String[] args) throws Exception {
        final TreeProcessor treeProcessor = new TreeProcessor();
        treeProcessor.parseMethod(AnnotationClient.class);
    }
}
