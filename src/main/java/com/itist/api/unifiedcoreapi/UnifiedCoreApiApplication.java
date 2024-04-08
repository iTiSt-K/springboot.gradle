package com.itist.api.unifiedcoreapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class UnifiedCoreApiApplication {

    @Value("${spring.application.name}")
    private String appName;
 
	@Value("${spring.profiles.active}")
    private String profile;

    @Value("${test}")
    private String test;

	public static void main(String[] args) {
		// SpringApplication application = new SpringApplication(MainTravelWebApplication.class);
		// application.setBannerMode(Banner.Mode.OFF);
		// application.run(args);

        SpringApplication.run(UnifiedCoreApiApplication.class, args);
	}

	@PostConstruct
    private void start() {
        log.info(">>> Started {} !!!", appName);
        log.debug("profile = {}", profile);
		log.debug("test = {}", test);
    }
}
