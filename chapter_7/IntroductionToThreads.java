public class IntroductionToThreads {
	
	public static void main(String[] args) {
		(new Thread(new PrintData())).start();
		(new ReadInventoryThread()).start();
	}

}

class PrintData implements Runnable {
	public void run(){
		for(int i = 0; i < 3; i++)
			System.out.println("Printing record: " + i);
	}
}

class ReadInventoryThread extends Thread {

	@Override
	public void run() {
		System.out.println("Printing zoo inventory");
	}
}
