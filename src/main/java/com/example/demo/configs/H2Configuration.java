package com.example.demo.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 * @author xcaue
 * @apiNote configuracao BD H2
 */
@Configuration
@EnableJpaRepositories(
		basePackages = "com.example.demo.repositories.h2",
		entityManagerFactoryRef = "h2EntityManager")
public class H2Configuration {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "h2.datasource")
	public DataSource dataSourceH2() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean h2EntityManager(EntityManagerFactoryBuilder builder,
			@Qualifier("dataSourceH2") DataSource dataSource) {
		return builder
				.dataSource(dataSource)
				.packages("com.example.demo.entities.h2")
				.build();

	}

}