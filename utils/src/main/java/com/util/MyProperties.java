package com.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Configuration
@EnableConfigurationProperties
public class MyProperties {
    @Bean
    @ConfigurationProperties(prefix = "connectors")
    public MyConfig connectors() {
        return new MyConfig();
    }
}