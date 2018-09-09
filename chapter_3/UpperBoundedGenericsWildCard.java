import java.util.List;
import java.util.ArrayList;

/*
* Using upper bounded wildcard allows inferring of methods from the superclass
* The upper/lower bound list becomes locally immutable
*/

public class UpperBoundedGenericsWildCard{
	
	public static class Bird{
		public void fly(){ System.out.println("Bird flying...");};
	}
	public static class Sparrow extends Bird{
		@Override
		public void fly() {System.out.println("Sparrow flying...");};
	}

	public static void main(String args[]){
		List<? extends Bird> list = new ArrayList<Bird>();
		
		//compiler doesn't know what kind of list it is
		//list.add(new Bird()); //Does not compile
		// list.add(new Sparrow()); //Does not compile

		List<Bird> birds = new ArrayList<>();
		birds.add(new Bird());
		birds.add(new Sparrow());

		fly_only_birds(birds);
		fly_any_kinds(birds);

		List<Sparrow> sparrows = new ArrayList<>();
		sparrows.add(new Sparrow());
			
		//fly_only_birds(sparrows);  //DOES NOT COMPILE
		fly_any_kinds(sparrows);
		
	}

	public static void fly_only_birds(List<Bird> birds){
		for(Bird bird:birds){ bird.fly();}
	}	

	public static void fly_any_kinds(List<? extends Bird> birds){
		for(Bird bird:birds){ bird.fly();}
	} 

}
