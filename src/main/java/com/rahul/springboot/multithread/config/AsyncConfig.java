package com.rahul.springboot.multithread.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncConfig {
	
	
	@Bean(name = "taskExecutor")
	public Executor taskExecutor() {
		ThreadPoolTaskExecutor execetor = new ThreadPoolTaskExecutor();
		execetor.setCorePoolSize(2);
		execetor.setMaxPoolSize(2);
		execetor.setQueueCapacity(100);
		execetor.setThreadNamePrefix("userThread-1");
		execetor.initialize();
		return execetor;
	}


}
