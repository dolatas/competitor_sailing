package com.dododev.sailingcompetition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.dododev.sailingcompetition.config.AppConfig;

@Configuration
@EnableAutoConfiguration
//@PropertySource("classpath:application.properties")
public class App {
    public static void main( String[] args ){
    	SpringApplication.run(AppConfig.class, args);
    }
}
