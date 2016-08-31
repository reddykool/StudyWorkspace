
public class PRecursion {
	
	public static void start() {
		System.out.println("Fact(6) is " + facto(5));
	}
	public static long facto(long n) {
		if(n<=1)
			return 1;
		else
			return n*facto(n-1);
	}

}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PRecursion obj = new PRecursion();
	obj.start();
	System.out.println("****   END of program  *****");		
}
*/