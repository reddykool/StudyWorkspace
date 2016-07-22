import java.util.Random;


public class RandomNum {

	public void show()
	{
		Random dice = new Random();
		int num;
		
		for (int counter = 1; counter <=10; counter++) {
			num = 1+dice.nextInt(9);
			System.out.println(num +" ");
		}
	}
}


/*
public class MainForAll {
  public static void main(String args[]) {
	  System.out.println("****   START of program  *****");
	  
	  RandomNum rNum = new RandomNum();
	  rNum.show();
	  
	  System.out.println("****   END of program  *****");
	}
}
*/