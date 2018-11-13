package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.Formation;

public class NationalTeam extends Team {
	
	private String country = Constants.DEFAULT_COUNTRY;

	public NationalTeam(String name, Formation formation, String country) {
		super(name, formation);
		this.country = country;
		registeredPlayers= new SimpleFootballPlayerCollectionImpl(Constants.MAX_NO_PLAYERS_NATIONAL);
		
	}
	
	public NationalTeam() {
		registeredPlayers= new SimpleFootballPlayerCollectionImpl(Constants.MAX_NO_PLAYERS_NATIONAL);
	}
	
	public String getCountry() {
		return country;
	}

	public boolean registerPlayer(FootballPlayer player) {
		if(player.getCountry()==country) {
				if(registeredPlayers.size()<Constants.MAX_NO_PLAYERS_NATIONAL) {
					if(registeredPlayers.contains(player)) {
						return false;
					}
						else {
							registeredPlayers.add(player);
							return true;
						}	
				}
		}
		return false;
	}
	
	public double calculateRating() {
		double rating = Constants.THIRTY_PERCENT*registeredPlayers.calculateSkillSum() + Constants.SEVENTY_PERCENT*registeredPlayers.calculateEmotionSum();
		return rating;
	}

	

}
