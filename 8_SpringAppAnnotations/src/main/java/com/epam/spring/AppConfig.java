package com.epam.spring;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import (LoggerConfig.class)
public class AppConfig {

	@Bean
	public Client client() {
		return new Client();
	}
	
	@Bean
	public Map<EventType,EventLogger> eventLoggers(){
		return new LinkedHashMap();
	}
	
    @Bean
    public EventLogger defaultLogger() {
    	return new FileEventLogger();
    }
    
	@Bean
	public App app() {
		return new App();
	}
	
	
}
