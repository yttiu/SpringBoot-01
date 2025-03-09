package com.hnkj.springboot_01;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringBoot01Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringBoot01Application.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}