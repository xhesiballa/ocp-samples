/*
*@Immutable Object pattern
*/
import java.util.*;

public final class Immutable {
	
	//make all instance members private and final

	private final int length;
	private final int width;
	private final List<String> stringList;

	//User the constructor to set all properties

	public Immutable(int length, int width, List<String> stringList){
		this.length = length;
		this.width = width;
		//create a copy of the list so that no external reference exists outside of the class
		if(stringList == null){
			throw new RuntimeException("stringList is required");
		}
		this.stringList = new ArrayList<>(stringList);
	}

	//Do no provide any setter methods

	public int getLength(){
		return length;
	}

	public int getWidth(){
		return width;
	}

	//do not return references to immutable objects
	//public List<String> getStringList(){
	//	return stringList;
	//}

	public String getStringListElement(int index){
		return stringList.get(index);
	}

	public int getArea(){
		return length * width;
	}

	public String toString(){
		return "{length:" + length + ", width: " + width + ", stringList: " + stringList +  "}"; 
	}

	public static void main(String[] args){
		List<String> stringList = new ArrayList<>();
		stringList.add("aasdf");
		stringList.add("fad");
		stringList.add("wer");

		Immutable immutable = new Immutable(25, 35, stringList);
		System.out.println(immutable);

		//immutable.getStringList().clear();
		System.out.println(immutable);
		System.out.println("area: " + immutable.getArea());
	}
}