package com.forezp.servicefeign;

import org.springframework.stereotype.Component;

@Component //把普通pojo实例化到spring容器中
public class SchedualServiceHiHystric implements  SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
