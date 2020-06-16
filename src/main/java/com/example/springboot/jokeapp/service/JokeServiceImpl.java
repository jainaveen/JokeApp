package com.example.springboot.jokeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuote;

	//old code
	/*
	public JokeServiceImpl() {
		this.chuckNorrisQuote = new ChuckNorrisQuotes();
	}
*/
	
	//new code - convert it to construction injection
	//ChuckNorrisQuotes is not a Spring bean. Hence, below logic will not work
	// we need to add it as part of bean. For which, we will create a configuration class
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuote) {
		this.chuckNorrisQuote =  chuckNorrisQuote;
	}

	@Override
	public String getJoke() {

		return chuckNorrisQuote.getRandomQuote();
	}

}
