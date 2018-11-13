package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.PlayingPosition;

public class FootballPlayer extends Person {
	private int playingSkill = Constants.DEFAULT_PLAYING_SKILL;
	private PlayingPosition playingPosition = Constants.DEFAULT_PLAYING_POSITION;
	
	public FootballPlayer() {
		
	}

	public FootballPlayer(String name, String country, int emotion, int playingSkill, PlayingPosition playingPosition) {
		super(name, country, emotion);
		if(playingSkill<1 || playingSkill >100)
			playingSkill = Constants.DEFAULT_PLAYING_SKILL;
		this.playingSkill = playingSkill;
		if(playingPosition!=PlayingPosition.DF && playingPosition!=PlayingPosition.FW && playingPosition!=PlayingPosition.GK && playingPosition!=PlayingPosition.GK)
			playingPosition=Constants.DEFAULT_PLAYING_POSITION;
		this.playingPosition = playingPosition;
	}


	public int getPlayingSkill() {
		return playingSkill;
	}
	
	public void setPlayingSkill(int newSkill) {
		if(newSkill<1 || newSkill >100)
			newSkill = Constants.DEFAULT_PLAYING_SKILL;
		playingSkill = newSkill;
	}
	
	public PlayingPosition getPlayingPosition() {
		return playingPosition;
	}
	
	public void setPlayingPosition(PlayingPosition newPos) {
		if(newPos!=PlayingPosition.DF && newPos!=PlayingPosition.FW && newPos!=PlayingPosition.GK && newPos!=PlayingPosition.GK)
			newPos=Constants.DEFAULT_PLAYING_POSITION;
		this.playingPosition = newPos;
	}

}
