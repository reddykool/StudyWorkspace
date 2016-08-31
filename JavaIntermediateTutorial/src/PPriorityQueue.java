import java.util.PriorityQueue;

public class PPriorityQueue {
	public void start() {
		PriorityQueue<String> que = new PriorityQueue<String>();
		que.offer("firstBillion");
		que.offer("secondBillion");
		que.offer("thirdBillion");
		
		System.out.println("Queue is: "+ que);
		
		System.out.println("Queue peek: "+ que.peek());
		//remove priority first
		System.out.println("Queue poll: "+ que.poll());
		System.out.println("Now, Queue peek: "+ que.peek());
	}
}

/*
	public static void main(String args[]) {
		System.out.println("****   START of program  *****");
		PPriorityQueue obj = new PPriorityQueue();
		obj.start();
		System.out.println("****   END of program  *****");		
	}
*/ 
