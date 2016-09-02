import java.util.*;

public class PThreadsBasic implements Runnable{
	String name;
	int time;
	Random r = new Random();
	
	public PThreadsBasic(String s) {
		name = s;
		time = r.nextInt(999);
	}
	
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is UP\n", name);
		}catch(Exception e) { }
	}
}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	
	Thread t1 = new Thread(new PThreadsBasic("One"));
	Thread t2 = new Thread(new PThreadsBasic("Two"));
	Thread t3 = new Thread(new PThreadsBasic("Three"));
	Thread t4 = new Thread(new PThreadsBasic("Four"));
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
	System.out.println("****   END of program  *****");		
}
*/