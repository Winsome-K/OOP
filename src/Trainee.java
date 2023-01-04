
public class Trainee {
	
	public String name;
	
	public int age;
	
	public String study;
	
	public boolean programmingExperience;
	
	public String programmingLanguage;
	
	public void printPersonaInfo() {
		System.out.println("Naam is " + name + " Leeftijd is " + age + " Study is " + study );
	}
	
	public void printProgramExperience() {
		System.out.println("Programmeerervaring " + programmingExperience + " Programmeertaal " + programmingLanguage);
	}
	
	public int increaseAge (int increaseAge) {
		age = age + increaseAge;
				
		return age;
	}
	
	public void changeLanguage(String newLanguage) {
		programmingLanguage = newLanguage;
	}
	
	public String addLanguage (String extraLanguage) {
		programmingLanguage = programmingLanguage + extraLanguage;
		
		return programmingLanguage;
	}
	
	public Trainee() {
		
	}
	
	public Trainee(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	
	public Trainee(int newAge) {
		age = newAge;
	}
}
