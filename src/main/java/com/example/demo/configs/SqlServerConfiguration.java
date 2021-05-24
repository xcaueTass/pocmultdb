package com.example.demo.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 * 
 * @author xcaue
 * @apiNote - configuracao BD SQL
 */
@Configuration
@EnableJpaRepositories(
		basePackages = "com.example.demo.repositories.sql",
		entityManagerFactoryRef = "sqlEntityManager")
public class SqlServerConfiguration {

	@Bean
	@ConfigurationProperties(prefix = "sql.datasource")
	public DataSource dataSourceSql() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean sqlEntityManager(EntityManagerFactoryBuilder builder,
			@Qualifier("dataSourceSql") DataSource dataSource) {
		return builder
				.dataSource(dataSource)
				.packages("com.example.demo.entities.sql")
				.build();

	}

}
