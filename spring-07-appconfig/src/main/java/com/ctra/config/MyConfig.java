package com.ctra.config;

import com.ctra.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Configuration 代表这是一个配置类，就和我们之前看的 beans.xml
@Configuration
public class MyConfig {
    // 注册一个 bean，就相当于我们之前写的一个 bean 标签
    // 这个方法的名字，就相当于bean标签中的id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        // 由于这里创建了一个 user对象，所以可以不用在User类中使用 @Component
       return new User();
    }

}
