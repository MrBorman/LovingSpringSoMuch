package ru.sobornov.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	private Music music;
	
	private String name;
	private int volume;
	@Autowired	
	public MusicPlayer(@Qualifier("rockMusic") Music music) {
		this.music = music;
	}
	public MusicPlayer() {}
	
	public void playMucic() {
		System.out.println("Playing " + music.getSong());
	}
	
	public void setMusic(Music music) {
		this.music = music;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
