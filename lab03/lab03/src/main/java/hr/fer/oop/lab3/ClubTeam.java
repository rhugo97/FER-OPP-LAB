package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.Formation;

public class ClubTeam extends Team {
	
	private int reputation = Constants.DEFAULT_REPUTATION;
	
	public ClubTeam() {
		registeredPlayers = new SimpleFootballPlayerCollectionImpl(Constants.MAX_NO_PLAYERS_CLUB);
	}
	
	public ClubTeam(String name, Formation formation, int reputation) {
		super(name, formation);
		if(reputation<1 || reputation>100) {
			this.reputation=Constants.DEFAULT_REPUTATION;
		}
		this.reputation = reputation;
		registeredPlayers = new SimpleFootballPlayerCollectionImpl(Constants.MAX_NO_PLAYERS_CLUB);
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void setReputation(int newRep) {
		if(newRep<1 || newRep>100)
			newRep=Constants.DEFAULT_REPUTATION;
		reputation = newRep;
	}
	
	public boolean registerPlayer(FootballPlayer player) {
		if(player.getPlayingSkill()>=reputation) {
			if(registeredPlayers.size()<Constants.MAX_NO_PLAYERS_CLUB) {
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
		double rating = Constants.SEVENTY_PERCENT*registeredPlayers.calculateSkillSum() + Constants.THIRTY_PERCENT*registeredPlayers.calculateEmotionSum();
		return rating;
	}
	
	

}
