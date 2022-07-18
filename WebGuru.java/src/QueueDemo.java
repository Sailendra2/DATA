import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) {

        Queue<String> que = new LinkedList<String>();
		
		que.offer("Hari");
		que.offer("Gani");
		que.offer("Good");
		que.offer("Fine");
		
		System.out.println(que.peek());// fetch value but does not remove
		
		while(!que.isEmpty())
			
			System.out.println(que.poll());// fetch value and remove from queue
	}

}
