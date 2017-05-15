package me.cloudex.better.springboot.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 15/05/2017.
 */
@Component
public class OptionArgsBean implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        for (String arg : args) {
            System.out.println("OptionArgsBean:" + arg);
        }
    }
}
