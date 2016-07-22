
public class DogList {
	
	private Dog[] theList = new Dog[5];
	private int i = 0;
	
	public void add(Dog d) {
		if( i < theList.length) {
			theList[i] = d;
			System.out.println("Dog added at index: " + i);
			i++;
		}
		else
			System.out.println("List reached Max: " + i);			
	}

}

/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");	
	
	DogList listObj = new DogList();
	
	Dog dogObj = new Dog();
	listObj.add(dogObj);
	listObj.add(dogObj);
	listObj.add(dogObj);
	listObj.add(dogObj);
	listObj.add(dogObj);
	listObj.add(dogObj);
	listObj.add(dogObj);
	listObj.add(dogObj);
	
	System.out.println("****   END of program  *****");	
}
*/