import me.cloudex.better.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("me.cloudex.better.springboot")
public class Example {

    @Autowired
    private AccountService accountService;

    public static void main(String[] args) throws Exception {
        //SpringApplication.run(Example.class, args);
        new SpringApplicationBuilder()
            .sources(Example.class)
            .bannerMode(Banner.Mode.OFF)
            .run(args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/say")
    String say() {
        return accountService.sayHello("Bob");
    }
}