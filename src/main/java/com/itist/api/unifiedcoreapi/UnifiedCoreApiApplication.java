package com.itist.api.unifiedcoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		SpringApplication.run(UnifiedCoreApiApplication.class, args);
		log.info(">>> Started [] !!!", appName);
	}

	@PostConstruct
    private void start() {
        log.debug("profile = []", profile);
		log.debug("test = []", test);
    }
}
