package com.ctra.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component注入  等价于 <bean id="user" class="com.ctra.pojo.User"/>


@Component
@Scope("prototype")
public class User {

    // @Value 就等价于 <property name="name" value="kuangshen"/>
    // 就等价于 public String name ="wangl";

    public  String name ;

    @Value("wangl")
    public void setName(String name) {
        this.name = name;
    }
}
