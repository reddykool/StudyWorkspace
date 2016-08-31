
public class PGenericMethods {
	public void start() {
		Integer [] iray = {1,2,3,4};
		Character [] cray = {'a', 'b', 'c', 'd'};
		String [] sray = {"I", "am", "a", "Multi", "Millionaire"};
		int [] in = {10,20,30,40};
		char [] ch = {'r', 'e', 'd', 'd', 'y'};
		
		printMe(iray);
		printMe(cray);
		printMe(in);
		printMe(ch);
		printMe(sray);
		
		System.out.println("Max val :" + max(23,69,12));
		System.out.println("Max string :" + max("Ammu", "Rohan", "Megan"));
	}
	
	//Generic Method
	private static <T> void printMe(T[] tArray) {
		System.out.println("Generic Method");
		for(T x:tArray)
			System.out.printf("%s ", x);
		System.out.println();
	}
	
	//Overloaded Methods
	private static void printMe(int [] i) {
		System.out.println("int Method");
		for(int x:i)
			System.out.printf("%s ", x);
		System.out.println();
	}
	
	private static void printMe(char [] c) {
		System.out.println("char Method");
		for(char x:c)
			System.out.printf("%s ", x);
		System.out.println();
	}
	
	//Generic return
	private static <T extends Comparable<T>> T max(T a, T b, T c) {
		T m = a;
		if(b.compareTo(a) > 0)
			m = b;
		
		if(c.compareTo(m) > 0)
			m = c;
			
		return m;
	}
	
}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PGenericMethods obj = new PGenericMethods();
	obj.start();
	System.out.println("****   END of program  *****");		
}
*/
