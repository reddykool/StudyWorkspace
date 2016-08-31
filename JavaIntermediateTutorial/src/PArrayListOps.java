import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PArrayListOps {
	public static void start() {
		String [] stuff = {"hi", "Hello", "How", "when", "why"};
		LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));
		printMe(theList);
		
		theList.add("Billionaire");
		theList.addFirst("Millionare");
		printMe(theList);
		
		stuff = theList.toArray(new String[theList.size()]);
		for(String s : stuff) {
			System.out.printf("%s ", s);
		}
		System.out.println();
		
	}
	
	private static void printMe(LinkedList<String> L1) {
		for(String s:L1) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}	

}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PArrayListOps obj = new PArrayListOps();
	obj.start();
	System.out.println("****   END of program  *****");		
}
*/