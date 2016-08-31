import java.util.*;

public class PLinkedList {
	public static void start() {
		String [] things = {"one", "two", "three", "four", "five"};
		List<String> list1 = new LinkedList<String>(); 
		for(String s:things) {
			list1.add(s);
		}

		String [] moreThings = {"ten", "twenty", "thirty", "forty", "fifty"};
		List<String> list2 = new LinkedList<String>(); 
		for(String s:moreThings) {
			list2.add(s);
		}
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2,7);
		printMe(list1);
		reverseMe(list1);
		printMe(list1);
	}
	
	private static void printMe(List<String> L1) {
		for(String s:L1) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
	
	private static void removeStuff(List<String> L1, int from, int to) {
		L1.subList(from, to).clear();
	}

	private static void reverseMe(List<String> L1) {
		ListIterator<String> iter = L1.listIterator(L1.size());
		while(iter.hasPrevious())
			System.out.printf("%s ",iter.previous());
		System.out.println();
	}
}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PLinkedList obj = new PLinkedList();
	obj.start();
	System.out.println("****   END of program  *****");		
}
*/
