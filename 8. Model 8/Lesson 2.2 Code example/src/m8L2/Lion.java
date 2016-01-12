package m8L2;

public class Lion extends Animal {

	private static final String FAVORITE_FOOD = " Meat ";
	
	@Override
	public String getName(){
		return " Larry the Lion ";
	}
	
	@Override
	public String eats(){
		return FAVORITE_FOOD;
	}
	
	@Override
	public void eat(String food){
		if (food.equals(FAVORITE_FOOD)){
			System.out.println(" Roar , yum, I love " + food + "");
		} else {
			System.out.println("ROAR! .. Eat the Zookeepr!");
		}
	}
}
