package com.fidev.socialspringlogin;

import com.fidev.socialspringlogin.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SocialSpringLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialSpringLoginApplication.class, args);
	}

}
