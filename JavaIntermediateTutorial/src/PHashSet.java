import java.util.*;

public class PHashSet {
	public void start() {
		String [] words = {"funk", "chunk", "furry", "chunk", "funk"};
		
		List<String> list = Arrays.asList(words);
		System.out.println("List is: "+ list);
		
		Set<String> set = new HashSet<String>(list);
		System.out.println("Set is: "+ set);
		
	}
}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PHashSet obj = new PHashSet();
	obj.start();
	System.out.println("****   END of program  *****");		
}
*/