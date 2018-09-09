
public class GenericInterface {
	
	public static void main(String[] args){
			
		Shippable<Robot> robotShippable = new ShippableRobotCrate();
		Shippable<Elephant> elephantShippable = new ShippableElephantCrate();
		
			
		Robot robot = new Robot();
		Elephant elephant = new Elephant();
	
		robotShippable.ship(robot);
		elephantShippable.ship(elephant);	

		Shippable<Robot> shippableRobot = new ShippableAbstractCrate<>();
		Shippable<Elephant> shippableElephantCrate = new ShippableAbstractCrate<>();

		shippableRobot.ship(robot);
		shippableElephantCrate.ship(elephant);	

	}
}

interface Shippable<T> {

	void ship(T t);

}

class ShippableRobotCrate implements Shippable<Robot> {
	public void ship(Robot robot){
		System.out.println("Shiping Robot");
	}

}


class ShippableElephantCrate implements Shippable<Elephant> {
	
	public void ship(Elephant elephant){
		System.out.println("Shipping Elephant");
	}
}

class ShippableAbstractCrate<U> implements Shippable<U>{

	public void ship(U t) {
		System.out.println(t.toString());
	}
}
