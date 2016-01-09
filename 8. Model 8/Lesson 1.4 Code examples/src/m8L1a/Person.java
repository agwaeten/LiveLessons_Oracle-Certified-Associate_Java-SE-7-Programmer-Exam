package m8L1a;

public class Person {

	private String name; 
	public String hairColor;
	
	public Person (String name, String haircolor) {
		this.name = name;
		this.hairColor = hairColor;
	}
	
	public String getName(){
		return name;
	}
	public void greet(){
		System.out.println("Hello , my name is"+name);
	}
}
