public class ExceptionsAndAssertions {
	
	public static void main(String[] args) {
		case_1();
		case_2();
	}

	public static void case_1() {
		System.out.println("----- Case 1 ------");

		try(JammedCage cage = new JammedCage()){
			System.out.println("Put turkey in");
			throw new IllegalStateException("turkeys endered the cage");
		}catch(IllegalStateException e){
			System.out.println("caught: " + e.getMessage());
			for(Throwable t: e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
		}
	}

	//Enable assertions by using the flag -ea when running
	public static void case_2(){
		System.out.println("----- Case 2 -----");
		int numGuests = -5;
		assert numGuests > 0;
		System.out.println(numGuests);
	}

	static class JammedCage implements AutoCloseable {
		
		@Override
		public void close() throws IllegalStateException {
			throw new IllegalStateException("Cage door does not close");
		}
	}

}
