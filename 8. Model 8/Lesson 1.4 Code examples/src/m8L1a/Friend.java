package m8L1a;

public class Friend extends Person {
	private String favor;

	public Friend(String name, String hairColor,String favor){
		super (name,hairColor);
		this.favor = favor;
	}
	public void doFavor(){
		System.out.println("Hey,my friend, let me" + favor +"!");
	}
}
