package com.example.springboot.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuote;

	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuote) {
		this.chuckNorrisQuote = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {

		return chuckNorrisQuote.getRandomQuote();
	}

}
