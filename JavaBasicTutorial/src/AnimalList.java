
public class AnimalList {
	private Animal[] theList = new Animal[5];
	private int i = 0;
	
	public void add(Animal a) {
		if( i < theList.length) {
			theList[i] = a;
			System.out.println("Animal \"" + a +"\" added at index: " + i);
			//System.out.println("Animal \"" + a.toString() +"\" added at index: " + i);
			a.noise();
			i++;
		}
		else
			System.out.println("List reached Max: " + i);			
	}
}


/*
public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	AnimalList listObj = new AnimalList();
	
	Dog dogObj = new Dog();
	listObj.add(dogObj);
	listObj.add(dogObj);
	listObj.add(dogObj);
	
	Fish fishObj = new Fish();
	listObj.add(fishObj);
	listObj.add(fishObj);
	
	listObj.add(dogObj);
	listObj.add(fishObj);
	listObj.add(dogObj);
	System.out.println("****   END of program  *****");
}
*/