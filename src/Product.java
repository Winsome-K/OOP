
public class Product {
	
	public String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean soldOut;
	
	public int storage;
	
	
	public Product() {
	System.out.println("In constructor");
	
	name = "";
	soldOut = false;
	storage = 0;
	}
	
	public Product(String newName) {
		name = newName;
	}
	
	
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public int decreaseStorage(int decrease) {
		storage = storage - decrease;
		
		return storage;
	}
}
