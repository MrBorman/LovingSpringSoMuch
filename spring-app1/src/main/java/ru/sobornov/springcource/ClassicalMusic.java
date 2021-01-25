package ru.sobornov.springcource;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Hungarian Rhapsody";
	}

}
