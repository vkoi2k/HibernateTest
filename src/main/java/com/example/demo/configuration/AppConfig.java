package com.example.demo.configuration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class AppConfig {

	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setPackagesToScan("com.example.demo.model");
		return sessionFactory;
	}
	
	@Bean
	public DateFormat dateFormat() {
		SimpleDateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
		return dfm;
	}
}
