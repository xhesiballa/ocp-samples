public class GenericMethod {

	public static <T> Shippable<T> getShippable() {
		return new ShippableAbstractCrate<T>();
	}

	public static void main(String args[]) {
		
		Elephant elephant = new Elephant();
		Robot robot = new Robot();

		Shippable<Elephant> elephantShippable = getShippable();
		Shippable<Robot> robotShippable = getShippable();

		elephantShippable.ship(elephant);
		robotShippable.ship(robot);
	}
} 
