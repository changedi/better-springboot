package me.cloudex.better.springboot.service;
import org.springframework.stereotype.Service;

/**
 * Created by zunyuan.jy on 02/05/2017.
 */
@Service
public class AccountService {

    public String sayHello(String name) {
        return "hello " + name;
    }
}
