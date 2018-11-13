package hr.fer.oop.lab3.demo;

import hr.fer.oop.lab3.ClubTeam;
import hr.fer.oop.lab3.Coach;
import hr.fer.oop.lab3.FootballPlayer;
import hr.fer.oop.lab3.SimpleFootballPlayerCollectionImpl;
import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.Formation;
import hr.fer.oop.lab3.welcomepack.PlayingPosition;
import hr.fer.oop.lab3.welcomepack.SimpleFootballPlayerCollection;

public class CoachTest {

	public static void main(String[] args) {

		Coach defaultCoach = new Coach();
		Coach mainCoach = new Coach("Main", Constants.DEFAULT_COUNTRY, 1, 1, Formation.F352);
		Coach helpCoach = new Coach();
		SimpleFootballPlayerCollection teste1 = new SimpleFootballPlayerCollectionImpl(Constants.MAX_NO_PLAYERS_CLUB);
		
		if (defaultCoach.equals(null)) {
			System.err.println("TEST FAILED: Coach is null");
		}

		if (mainCoach.equals(defaultCoach)) {
			System.err.println("TEST FAILED: Default and Main coach must be different");
		}
		
		helpCoach.setCoachingSkill(10);
		helpCoach.setEmotion(10);
		if (!defaultCoach.equals(helpCoach)) {
			System.err.println("TEST FAILED: Wrong comparison of coaches.");
		}
		
		Coach wrongCoach = new Coach(null, null, -5, 150, Formation.F541);
		if(wrongCoach.getName()==null || 
				wrongCoach.getCountry() == null || 
				wrongCoach.getEmotion() <0 ||
				wrongCoach.getCoachingSkill() > 100){
			System.err.println("TEST FAILED: Coach values must be in boundries!!");
		}
		
		ClubTeam reputationTeam = new ClubTeam();
		
		FootballPlayer goalPlayer = new FootballPlayer("NAME" + 0, Constants.DEFAULT_COUNTRY, 10, 100,
				PlayingPosition.GK);
		teste1.add(goalPlayer);
		reputationTeam.registerPlayer(goalPlayer);
		for (int i = 1; i < 6; i++) {
			FootballPlayer dfPlayer = new FootballPlayer("NAME" + i, Constants.DEFAULT_COUNTRY, 10, 100,
					PlayingPosition.DF);
			teste1.add(dfPlayer);
			reputationTeam.registerPlayer(dfPlayer);
			
		}
		for (int i = 6; i < 11; i++) {
			FootballPlayer mfPlayer = new FootballPlayer("NAME" + i, Constants.DEFAULT_COUNTRY, 10, 100,
					PlayingPosition.MF);
			teste1.add(mfPlayer);
			reputationTeam.registerPlayer(mfPlayer);
			
		}
		for (int i = 11; i < 25; i++) {
			FootballPlayer fwPlayer = new FootballPlayer("NAME" + i, Constants.DEFAULT_COUNTRY, 10, 100,
					PlayingPosition.FW);
			teste1.add(fwPlayer);
			reputationTeam.registerPlayer(fwPlayer);
			
		}
		mainCoach.setManagingTeam(reputationTeam);
		mainCoach.pickStartingEleven();
		for(int i=0;i<Constants.STARTING_ELEVEN_SIZE;i++) {
			System.out.println("Check: " + reputationTeam.getStartingEleven().getPlayers()[i].getName());
		}
		//ignore printed system errors displayed from another classes, as described in instructions.
		System.out.println("This is only valid message that should be displayed from this main!!!!");


	}
}
