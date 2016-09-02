import javax.swing.JFrame;

public class MainForAll {
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

}
