import java.util.Random;

public class PArray {
	
	public void show()
	{
		int temp[][] = {{10, 20}, {30,400}};
		int temp2[][] ={{12,34,45,60},{121}, {290, 43, 9}};
		int sum = 0;
		int dice[] = new int[7];
		Random rand = new Random();
		
		for(int i =0, j=0; i< temp.length; i++, j=0) {
			sum += temp[i][j++];
			sum += temp[i][j];
		}
		
		for (int roll = 1; roll <=990; roll++) {
			++dice[1+rand.nextInt(6)];
		}
		
		System.out.println("Index\tFrequency ");
		for(int i=1; i <dice.length; i++) {
			System.out.println(i +"\t" + dice[i]);
		}
		
		int total = 0;
		for(int x : dice) {
			total += x;
		}
		System.out.println("Array total: " + total);
		
		displayArray(temp);
		displayArray(temp2);
		
		average(1,2,3,4,50,4);
	}
	
	public static void displayArray(int x[][]) {
		System.out.println("displayArray()...");
		for(int row =0; row<x.length; row++) {
			for (int col =0; col < x[row].length; col++) {
				System.out.print(x[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void average(int...numbers) {
		System.out.println("average()...");
		int total = 0;
		for(int x:numbers) 
			total+=x;
		int avg = total/numbers.length;
		
		System.out.println("Total: "+total + "  Average: "+avg);
	}

}

/*
 * public class MainForAll {
	    public static void main(String args[]) {
			System.out.println("****   START of program  *****");
			PArray x = new PArray();
			x.show();
		
			System.out.println("****   END of program  *****");
		}
	}
*/