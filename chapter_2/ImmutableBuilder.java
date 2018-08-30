import java.util.*;
/*
* Builder Pattern
* Setting the properites with method chaining and creating the object with the build method
*/

public class ImmutableBuilder{
	
	private int length;
	private int width;
	private List<String> stringList;

	public ImmutableBuilder setLength(int length){
		this.length = length;
		return this;
	}

	public ImmutableBuilder setWidth(int width){
		this.width = width;
		return this;
	}

	public ImmutableBuilder setStringList(List<String> stringList){
		this.stringList = stringList;
		return this;
	}

	public Immutable build(){
		return new Immutable(length, width, stringList);
	}

	public static void main(String[] args){
		Immutable immutable = new ImmutableBuilder()
				.setLength(25)
				.setWidth(35)
				.setStringList(Arrays.asList("asdf", "reww", "zxcv"))
				.build();

		System.out.println(immutable);
	}
}