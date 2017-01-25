package com.devel.ideakeeper.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.devel.ideakeeper.server.repository")
@EnableTransactionManagement
@ComponentScan("com.devel.ideakeeper.server")
@PropertySource("classpath:db.properties")
public class DataBaseConfig {

    @Resource
    private Environment env;

}
