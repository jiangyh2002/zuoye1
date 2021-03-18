package com.example.springprops;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringPropsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPropsApplication.class, args);
        new SpringApplicationBuilder(SpringPropsApplication.class).bannerMode(Banner.Mode.OFF).run(args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringPropsApplication.class);
        builder.application().setAdditionalProfiles("prod");
        builder.run(args);
    }

}

