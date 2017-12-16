package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/12/10.
 * 开启扫描多个包时可以这么写
 * @ComponentScan(basePackages = {"controller","service"})
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "controller")
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
