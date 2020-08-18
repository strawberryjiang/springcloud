package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-07-03 15:04
 **/

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule_ZY();
    }
}
