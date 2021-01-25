package ru.sobornov.springcource;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music{

	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Wind cries Mary";
	}

}
