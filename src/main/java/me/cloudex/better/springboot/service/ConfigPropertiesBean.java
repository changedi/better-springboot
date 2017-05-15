package me.cloudex.better.springboot.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 15/05/2017.
 */
@Component
public class ConfigPropertiesBean {

    @Value("${product.name}")
    private String productName;

    @PostConstruct
    public void init() {
        System.out.println("ConfigPropertiesBean:" + productName);
    }
}
