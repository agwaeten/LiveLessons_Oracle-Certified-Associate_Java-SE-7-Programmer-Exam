package m8L2;

public class ZooKeeper {
	
  public void feedAnimals (Animal[] animals) {
	for (Animal a : animals){
		String name = a.getName();
		String food = a.eats();
		System.out.println(name + "like" + food);
		a.eat(food);
		System.out.println("============");
	}
}
}
