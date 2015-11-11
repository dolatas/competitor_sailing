package com.dododev.sailingcompetition.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.dododev.sailingcompetition.repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.dododev.sailingcompetition.model"})
public class RepositoryConfig {
}
