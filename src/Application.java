
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Applicatie is gestart");
	
		Product p = new Product();
		p.name = "TV";
		p.printName();
		
		Product p2 = new Product();
		p2.name = "Wasmachine";
		p2.storage = 12;
		int newStorage = p2.decreaseStorage(2);
		System.out.println("New storage is " + newStorage);
		
		Product p3 = new Product();
		p3 = new Product("Test");
		
		Trainee id = new Trainee();
		id.name = "Jos";
		id.age = 28;
		id.study = "AI";
		id.programmingExperience = true;
		id.programmingLanguage = "Java";
		id.printPersonaInfo();
		id.printProgramExperience();
		
		Trainee id4 = new Trainee("Pietje", 25);
		System.out.println(id4.name + " " + id4.age);
		id4 = new Trainee(25);
		System.out.println(id4.age);
		
		int increaseAge = id.increaseAge(2);
		System.out.println(increaseAge);
		id.changeLanguage("python");
		System.out.println(id.programmingLanguage);
		
		Trainee id2 = new Trainee();
		id2.name = "Just";
		id2.age = 30;
		id2.study = "BMC";
		id2.programmingExperience = true;
		id2.programmingLanguage = "Matlab";
		id2.printPersonaInfo();
		id2.printProgramExperience();
		
		Trainee id3 = new Trainee();
		id3.name = "Winsome";
		id3.age = 23;
		id3.study = "Informationscience";
		id3.programmingExperience = true;
		id3.programmingLanguage = "Python";
		id3.printPersonaInfo();
		id3.printProgramExperience();
	}

}
