package com.mankind.jwt_project;

import com.mankind.jwt_project.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class JwtProjectApplication {

	void main(String[] args) {
		SpringApplication.run(JwtProjectApplication.class, args);
	}

}
