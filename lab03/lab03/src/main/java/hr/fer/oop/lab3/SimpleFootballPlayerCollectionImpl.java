package hr.fer.oop.lab3;


import hr.fer.oop.lab3.welcomepack.SimpleFootballPlayerCollection;

public class SimpleFootballPlayerCollectionImpl implements SimpleFootballPlayerCollection {
	
	private FootballPlayer[] players;
	private final int maxSize;
	private int size=0;
	
	public SimpleFootballPlayerCollectionImpl(int newMaxSize) {
		this.maxSize = newMaxSize;
		players = new FootballPlayer[maxSize];
	}
	
	public boolean add(FootballPlayer newPlayer) {
		
		for(int n=0;n<maxSize;n++) {
			if(newPlayer.equals(players[n])) {
				return false;
			}
			if(players[n]==null) {
				players[n]= new FootballPlayer(newPlayer.getName(), newPlayer.getCountry(), newPlayer.getEmotion(), newPlayer.getPlayingSkill(), newPlayer.getPlayingPosition());
				return true;
			}	
		}
		return true;
	}

	public int size() {
			size=0;
			for(int n=0; n<maxSize; n++) {
				if(players[n]!=null) {
					size++;
				}
				else {
					break;
				}
			}
			
		return size;
	}

	@Override
	public boolean contains(FootballPlayer player) {
		for(int n=0; n<size(); n++) {
			if(player.equals(players[n])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		for(int n=9;n>=0;n--) {
			players[n]=null;
		}
		
	}

	@Override
	public int getMaxSize() {
		return maxSize;
	}

	@Override
	public int calculateEmotionSum() {
		int total=0;
		for(int n=0; n<size(); n++) {
			total=players[n].getEmotion()+total;
		}
		return total;
	}

	@Override
	public int calculateSkillSum() {
		int total=0;
		for(int n=0; n<size(); n++) {
			total=players[n].getPlayingSkill()+total;
		}
		return total;
	}

	@Override
	public FootballPlayer[] getPlayers() {

		return players;
	}

}
