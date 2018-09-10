import java.util.Queue;
import java.util.ArrayDeque;

/*
* Samples with Queue interface methods
*/

public class QueueInterface {

	public static void main(String[] args) {

		// queue functionality
		System.out.println("Queue functionalities");
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));
		System.out.println(queue.offer(4));
		System.out.println(queue);

		System.out.println(queue.peek());
		System.out.println(queue);

		System.out.println(queue.poll());
		System.out.println(queue);
	
		System.out.println(queue.poll());
                System.out.println(queue);

		System.out.println(queue.peek());
		

		// stack functionality
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(8);
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		
	}
}
