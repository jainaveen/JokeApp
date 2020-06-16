package com.example.springboot.jokeapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckConfiguration {
	
	@Bean
	public ChuckNorrisQuotes getChuckConfiguration() {
		return new ChuckNorrisQuotes();
	}

}
