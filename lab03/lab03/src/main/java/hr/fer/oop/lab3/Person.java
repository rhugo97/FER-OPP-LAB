package hr.fer.oop.lab3;

import hr.fer.oop.lab3.welcomepack.Constants;



public class Person {
	private String name = Constants.DEFAULT_PLAYER_NAME;
	private String country = Constants.DEFAULT_COUNTRY ;
	private int emotion = Constants.DEFAULT_EMOTION;
	
	public Person(){
		
	}

	public Person(String name, String country, int emotion) {
		if(name != null && !name.isEmpty()) {	
			this.name = name;
		}
		else {
			name = Constants.DEFAULT_PLAYER_NAME;	
			this.name = name;	
		}
		if(country != null && !country.isEmpty()) {
			this.country = country;
		}
		else {
			country = Constants.DEFAULT_COUNTRY;
			this.country = country;	
		}
		if(emotion<1 || emotion > 100)
			emotion = Constants.DEFAULT_EMOTION;
		this.emotion = emotion;
		
	}
	
	public void setEmotion(int newEmotion) {
		if(newEmotion<1 || newEmotion > 100)
			newEmotion = Constants.DEFAULT_EMOTION;
		emotion = newEmotion;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getEmotion() {
		return emotion;
	}
	
	public int hashCode() {
		int result = 17;
		result = 31 * result + name.hashCode();
		result = 31 * result + country.hashCode();
		return result;
	}
	
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(!(o instanceof Person))
			return false;
		Person person = (Person) o;
		return person.name.equals(name) && person.country.equals(country);
	}
	


}
