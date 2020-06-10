package com.example.springboot.jokeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuote;

	
	public JokeServiceImpl() {
		this.chuckNorrisQuote = new ChuckNorrisQuotes();
	}


	@Override
	public String getJoke() {

		return chuckNorrisQuote.getRandomQuote();
	}

}
