package com.ahzx;

import com.ahzx.SpringIocApplication;
import com.ahzx.config.AppConfig;
import com.ahzx.entity.GhDemo;
import com.ahzx.service.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringIocApplication.class)
@Slf4j
class SpringIocApplicationTests {

    @Test
    void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GhDemo gh = (GhDemo) context.getBean("ghDemo");
        gh.say();
        log.info(context.getBean("lubanFactoryBean").toString());
        log.info(context.getBean("lubanFactoryBean").toString());
        log.info(context.getBean("lubanFactoryBean").toString());

        log.info(context.getBean("hello").toString());
        //BeanFactoryPostProcessor中已经修改了BeanDefinition的BeanClass为GhDemo，此处将会报ClassCastException
        GhDemo user = (GhDemo) context.getBean("user");
        //log.info("----------->" + user.getBean1Name());
        log.info(String.valueOf(user));
    }


}
