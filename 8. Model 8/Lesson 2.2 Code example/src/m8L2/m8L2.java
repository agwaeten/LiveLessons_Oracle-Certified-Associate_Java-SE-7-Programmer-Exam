package m8L2;

public class m8L2 {

	public static void main(String[] args) {
      Animal [] zoo ={
		new Lion() , new Dog()
      };
      ZooKeeper keeper = new ZooKeeper();
      keeper.feedAnimals(zoo);
	}

}
