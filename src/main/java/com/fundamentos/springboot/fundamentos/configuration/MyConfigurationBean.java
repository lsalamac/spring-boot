package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation() {
        return new MyBeanImplement2();
    }

    @Bean
    public MyOperation beanOperationImplement() {
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationImplementWithDependency(MyOperation myOperation) {
        return new MyBeanWithDependencyImplement(myOperation);
    }

    @Bean
    public MyExample beanExampleImplement(){
        return new MyExampleImplement();
    }

    @Bean
    public MyExampleWithDependency beanExampleWithDependency(MyExample myExample) {
        return new MyExmapleWithDependencyImplement(myExample);
    }

}
