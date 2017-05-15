package me.cloudex.better.springboot.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * Created by zunyuan.jy on 12/05/2017.
 */
@Component
public class ArgsBean {

    @Autowired
    public ArgsBean(ApplicationArguments args) {
        String[] argString = args.getSourceArgs();
        if (argString != null) {
            for (String a : argString) {
                System.out.println("sourceArgs:" + a);
            }
        }
        Set<String> optionNames = args.getOptionNames();
        for (String option : optionNames) {
            System.out.println("optionArgs:" + option);
        }
    }
}
