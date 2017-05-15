package me.cloudex.better.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.context.ApplicationContext;

/**
 * Created by zunyuan.jy on 15/05/2017.
 */

public class ExitBean implements ExitCodeGenerator {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public int getExitCode() {
        return 10001;
    }

}
