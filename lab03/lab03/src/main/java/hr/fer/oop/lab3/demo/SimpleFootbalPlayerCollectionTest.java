package hr.fer.oop.lab3.demo;

import hr.fer.oop.lab3.FootballPlayer;
import hr.fer.oop.lab3.SimpleFootballPlayerCollectionImpl;
import hr.fer.oop.lab3.welcomepack.Constants;
import hr.fer.oop.lab3.welcomepack.PlayingPosition;
import hr.fer.oop.lab3.welcomepack.SimpleFootballPlayerCollection;

public class SimpleFootbalPlayerCollectionTest {

	public static void main(String[] args) {

		final int TEST_MAX_SIZE = 10;
		FootballPlayer fortest = new FootballPlayer("NAME5", Constants.DEFAULT_COUNTRY, -10, 110,PlayingPosition.FW);
		SimpleFootballPlayerCollection collection = new SimpleFootballPlayerCollectionImpl(TEST_MAX_SIZE);
		System.out.println(" ::::" + collection.size());
		if (collection.size() != 0) {
			System.err.println("TEST FAILED: Check current collection size!!");
		}

		for (int i = 0; i < 6; i++) {
			FootballPlayer sequentialPlayer = new FootballPlayer("NAME" + i, "", 1, 1, PlayingPosition.GK);
				collection.add(sequentialPlayer);
				System.out.println("Chequito: " + collection.getPlayers()[i].getName());
		}
		System.out.println("Emotion: " + collection.calculateEmotionSum());
		System.out.println("Skill: " + collection.calculateSkillSum());
		System.out.println("size:" + collection.size());
		System.out.println("Found: " + collection.contains(fortest));
		if(collection.size() > TEST_MAX_SIZE){
			System.err.println("TEST FAILED: Check collection max size!!");
		}
		
		//ignore printed system errors displayed from another classes, as described in instructions.
		System.out.println("This is only valid message that should be displayed from this main!!!!");
	}

}
