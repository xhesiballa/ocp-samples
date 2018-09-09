public class GenericClass{
	
	public static void main(String[] args){

		Elephant elephant = new Elephant();
		Crate<Elephant> elephantCrate = new Crate<>();
		System.out.println(elephantCrate);
		elephantCrate.packCrate(elephant);

		System.out.println(elephantCrate);
//		Robot robot = new Robot();
		
	}

}

class Elephant{
	@Override
	public String toString(){
		return "Elephant";
	}
}

class Robot{
	@Override
	public String toString(){
		return "Robot";
	}
}

class Crate<T>{
	private T contents;

	public void packCrate(T contents){
		this.contents = contents;	
	}

	public T emptyCrate(){
		return contents;
	}

	@Override
	public String toString(){
		if( contents != null ) {
			return contents.toString() + " in a crate";
		}else {
			return "empty crate";
		}
	}
}
