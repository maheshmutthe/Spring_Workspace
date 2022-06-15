package com.morningstar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages= {"com.morningstar.model", "com.morningstar.service", "com.morningstar.dao"})
@ComponentScan(basePackages="com.morningstar")
public class AppConfig {

}
