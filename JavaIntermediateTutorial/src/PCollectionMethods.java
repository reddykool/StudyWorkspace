import java.util.*;

public class PCollectionMethods {
	public void start() {
		//create an array and convert to list
		String [] things = {"eggs", "lazers", "hats","pie", "cakes"};
		Character [] chars = {'R', 'E', 'D', 'D', 'Y'};
		String [] fruits = {"apple", "orange", "pear","plumb", "apple", "mango"};
		List<String> L1 = Arrays.asList(things);
		List<Character> L2 = Arrays.asList(chars);
		List<String> L3 = Arrays.asList(fruits);
		
		Collections.sort(L1);
		System.out.println("list 1:\n" + L1);
		
		Collections.sort(L1, Collections.reverseOrder());
		System.out.println("reverse list 1:\n" + L1);
		
		System.out.println("list 2:\n" + L2);
		System.out.println("list 3:\n" + L3);
		//output(L2);
		
		//reverse and print the list2
		Collections.reverse(L2);
		System.out.println("reverse list 2:\n" + L2);
		
		//Copy list to new array, which filled with something initially
		Character [] newChars = new Character[8];
		List<Character> L2copy = Arrays.asList(newChars);
		Collections.fill(L2copy, '$');
	
		Collections.copy(L2copy, L2);
		System.out.println("copy list :\n" + L2copy);
		
		//fill list2 with some thing
		Collections.fill(L2, 'Z');
		System.out.println("Fill list 2:\n" + L2);
		
		
		//Add elements section
		ArrayList<String> arList = new ArrayList<String>();
		arList.add("gmail");
		arList.add("youtube");
		arList.add("google");
		
		System.out.println("array list :\n" + arList);
		
		//add all items
		Collections.addAll(arList, fruits);
		System.out.println("array list after addAll fruits:\n" + arList);

		Collections.addAll(arList, L1.toArray(new String[0]));
		System.out.println("array list after addAll List 1 :\n" + arList);
		
		//frequency and disjoint methods
		System.out.println("frequency of 'apple' in list3 :\n" + Collections.frequency(L3, "apple"));
		
		boolean chk = Collections.disjoint(L1, L3);
		System.out.println("L1 and L3 disjoint(nothing in commpn)? :" + chk);
	}
	
	

}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PCollectionMethods obj = new PCollectionMethods();
	obj.start();
	System.out.println("****   END of program  *****");		
}
*/