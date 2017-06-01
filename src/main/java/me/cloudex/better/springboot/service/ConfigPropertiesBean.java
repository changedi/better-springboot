package me.cloudex.better.springboot.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 15/05/2017.
 */
@Component
@Profile("prod")
public class ConfigPropertiesBean {

    @Value("${product.name}")
    private String productName;

    @Value("product.secret=${random.value}")
    private String secret;

    @PostConstruct
    public void init() {
        System.out.println("ConfigPropertiesBean:" + productName);
        System.out.println("ConfigPropertiesBean:" + secret);
    }
}
