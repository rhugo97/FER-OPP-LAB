package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.Formation;
import hr.fer.oop.lab3.welcomepack.ManageableTeam;
import hr.fer.oop.lab3.welcomepack.SimpleFootballPlayerCollection;


public abstract class Team implements ManageableTeam {
	private String name = Constants.DEFAULT_TEAM_NAME;
	private Formation formation = Constants.DEFAULT_FORMATION;
	SimpleFootballPlayerCollection startingEleven = new SimpleFootballPlayerCollectionImpl(Constants.STARTING_ELEVEN_SIZE);
	SimpleFootballPlayerCollection registeredPlayers;
	
	public Team() {
		  
	}
	
	public Team (String name, Formation formation) {
		this.name = name;
		this.formation = formation;
		
	}
	
	public String getName() {
		return name;
	}
	
	public Formation getFormation() {
		return formation;
	}
	
	public boolean isPlayerRegistered(FootballPlayer playerCheck) {
		if(registeredPlayers.contains(playerCheck)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean addPlayerToStartingEleven(FootballPlayer player){
		if(!isPlayerRegistered(player) || startingEleven.size()<Constants.STARTING_ELEVEN_SIZE) {
			startingEleven.add(player);
			return true;
		}
		else {
			return false;
		}
	}
	
	public SimpleFootballPlayerCollection getRegisteredPlayers() {
		return registeredPlayers;
	}
	
	public SimpleFootballPlayerCollection getStartingEleven() {
		return startingEleven;
	}
	
	public void setFormation(Formation newForm) {
		if(newForm!=null)
			formation=newForm;
	}
	
	public void clearStartingEleven() {
		startingEleven.clear();
	}
}
