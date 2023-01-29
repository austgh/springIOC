# 该项目主要是演示向spring 容器中加入Bean的几种方式
### @Configuration + @Bean  
### @ComponentScan + @Component  
### @Import 配合接口进行导入   
###### @Import直接导入类  
###### @Import + ImportSelector  
###### @Import + ImportBeanDefinitionRegistrar  
@Import(A.class) 如果A是普通的类，直接将A注入到容器中，如果A实现ImportBeanDefinitionRegistrar接口，则会调用registerBeanDefinitions
###### @Import + DeferredImportSelector  
### 使用FactoryBean。  
### 实现BeanDefinitionRegistryPostProcessor进行后置处理。  
https://mp.weixin.qq.com/s/WY2nOVoEeR4g90eG7FKPyQ

BeanFactory和FactoryBean 的区别  
手写IOC容器 核心是反射  
mybatis 如何将mapper 的代理注入到spring容器中的    
通过使用FactoryBean  
## ioc 模块 模拟spring 容器功能
## Spring整合Mybatis的核心原理总结一下  
1. 定义一个MyFactoryBean，用来将Mybatis的代理对象生成一个bean对象
2. 定义一个MyImportBeanDefinitionRegistrar，用来生成不同Mapper对象的MyFactoryBean
3. 定义一个@MynScan，用来在启动Spring时执行MyImportBeanDefinitionRegistrar的逻辑，并指定包路径  
   以上这个三个要素分别对象org.mybatis.spring中的：  
1. MapperFactoryBean  
2. MapperScannerRegistrar  
3. @MapperScan  
