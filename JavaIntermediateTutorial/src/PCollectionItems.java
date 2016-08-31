import java.util.*;

public class PCollectionItems {
	public void start() {
		String [] things = {"eggs", "lazers", "hats","pie"};
		List<String> list1 = new ArrayList<String>();
		
		for(String s:things) {
			list1.add(s);
		}
		
		System.out.println("List1 contains...:");
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		}

		String [] moreThings = {"peggs", "lazers", "Ghats","pie"};
		List<String> list2 = new ArrayList<String>();
	
		for(String s:moreThings) {
			list2.add(s);
		}
		
		System.out.println("\nList2 contians...:");
		for(int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		
		editList(list1, list2);
		System.out.println("\nList1 (Edited) contains...:");
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		}
		
		System.out.println();
	}
	
	public static void editList(Collection<String> L1, Collection<String> L2) {
		Iterator<String> iter = L1.iterator();
		while(iter.hasNext()) {
			if(L2.contains(iter.next())) {
				iter.remove();
			}
		}
	}
	

}


/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PCollectionItems obj = new PCollectionItems();
	obj.start();
	System.out.println("****   END of program  *****");		
}
*/