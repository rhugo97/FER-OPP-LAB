package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.Formation;
import hr.fer.oop.lab3.welcomepack.ManageableTeam;
import hr.fer.oop.lab3.welcomepack.Manager;
import hr.fer.oop.lab3.welcomepack.PlayingPosition;
import hr.fer.oop.lab3.welcomepack.SimpleFootballPlayerCollection;

public class Coach extends Person implements Manager {
	
	private int coachingSkill = Constants.DEFAULT_COACHING_SKILL;
	private Formation favoriteFormation = Constants.DEFAULT_FORMATION;
	private ManageableTeam managingTeam;
	private	int goalK=0;
	private int fW=0;
	private int mF=0;
	private int dF=0;
	
	public Coach() {
		
	}

	public Coach(String name, String country, int emotion, int coachingSkill, Formation favoriteFormation) {
		super(name, country, emotion);
		if(coachingSkill<1 || coachingSkill>100)
			coachingSkill=Constants.DEFAULT_COACHING_SKILL;
		this.coachingSkill = coachingSkill;
		if(favoriteFormation!=Formation.F352 && favoriteFormation!=Formation.F541 )
			favoriteFormation = Constants.DEFAULT_FORMATION;
		this.favoriteFormation = favoriteFormation;
	}
	
	public int getCoachingSkill() {
		return coachingSkill;
	}
	
	public void setCoachingSkill(int newSkill) {
		if(newSkill<1 || newSkill>100)
			newSkill=Constants.DEFAULT_COACHING_SKILL;
		coachingSkill = newSkill;
	}
	
	public Formation getFavoriteFormation() {
		return favoriteFormation;
	}
	
	public void setFavoriteFormation(Formation newFormation) {
		if(newFormation!=Formation.F352 && newFormation!=Formation.F541 )
			newFormation = Constants.DEFAULT_FORMATION;
		favoriteFormation = newFormation;
	}
	
	public void forceMyFormation() {
		managingTeam.setFormation(favoriteFormation);
	}
	
	public void pickStartingEleven() {
		SimpleFootballPlayerCollection newList = new SimpleFootballPlayerCollectionImpl(Constants.MAX_NO_PLAYERS_NATIONAL);
		
		newList = getManagingTeam().getRegisteredPlayers();
		for(int n=0; n<newList.size(); n++) {
			if(goalK==0) {
				if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.GK) {
					managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
					goalK++;
				}
			}
			else {
				if(getFavoriteFormation()==Formation.F352) {
					if(dF<3) {
						if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.DF) {
							managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
							dF++;
						}
					}
					if(mF<5) {
						if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.MF) {
							managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
							mF++;
						}
					}
					if(fW<2) {
						if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.FW) {
							managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
							fW++;
						}
					}
				}
				if(getFavoriteFormation()==Formation.F442) {
					if(dF<4) {
						if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.DF) {
							managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
							dF++;
						}
					}
					if(mF<4) {
						if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.MF) {
							managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
							mF++;
						}
					}
					if(fW<2) {
						if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.FW) {
							managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
							fW++;
						}
					}
				}
				if(getFavoriteFormation()==Formation.F541) {
					if(dF<5) {
						if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.DF) {
							managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
							dF++;
						}
					}
					if(mF<4) {
						if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.MF) {
							managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
							mF++;
						}
					}
					if(fW<1) {
						if(newList.getPlayers()[n].getPlayingPosition()==PlayingPosition.FW) {
							managingTeam.addPlayerToStartingEleven(newList.getPlayers()[n]);
							fW++;
						}
					}
				}
			}	
		}
	}
	
	public ManageableTeam getManagingTeam() {
		return managingTeam;
	}
	 
	public void setManagingTeam(ManageableTeam team) {
		if(team!=null) {
			this.managingTeam = team;
		}
	}
}
