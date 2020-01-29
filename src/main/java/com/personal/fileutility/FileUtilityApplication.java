package com.personal.fileutility;

import com.personal.fileutility.constants.CORSConfig;
import com.personal.fileutility.model.CORSDetail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class FileUtilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUtilityApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				for (CORSDetail corsDetail: CORSConfig.corsList)
					registry
						.addMapping(corsDetail.getPathName())
						.allowedOrigins(corsDetail.getAllowedOrigins())
						.allowedHeaders(corsDetail.getCorsHeaders());
			}
		};
	}
}
