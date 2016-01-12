package m8L2;

public class Dog extends Animal {

	@Override
	public String getName(){
		return " Dougal the Dog ";
	}
	
	@Override
	public String eats(){
		return " Kibbbles ";
	}
	
	@Override
	public void eat(String food){	
	System.out.println(" Woof , wag ! Greate , " + food +"I eat everything anyway , so I like too. ! ");
	}
}
