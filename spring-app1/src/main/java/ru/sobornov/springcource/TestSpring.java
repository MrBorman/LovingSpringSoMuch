package ru.sobornov.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml"
				);
		//Music music = context.getBean("musicBean", Music.class);
		
		//MusicPlayer musicPlayer = new MusicPlayer(music);
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		musicPlayer.playMucic();
		print(musicPlayer.getName() + " plays with " + musicPlayer.getVolume() + "% volume");

		context.close();
		
	}
	
	public static <T> void print(T text){
		System.out.println(text);
	}

}
