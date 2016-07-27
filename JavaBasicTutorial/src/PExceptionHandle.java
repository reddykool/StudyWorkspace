import java.util.*;

public class PExceptionHandle {
	public void CheckException() {
		Scanner input = new Scanner(System.in);
		int x = 1;
		do {
			try {
				System.out.println("Enter first num :");
				int num1 = input.nextInt(); 
				System.out.println("Enter second num :");
				int num2 = input.nextInt();
				System.out.println("about to div...");

				int div = num1/num2;
				
				System.out.println("Div done...");
				System.out.println(div);
				System.out.println("No issues so far...");
				x = 0;
			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("You cant do that****");
			}
		}while(x==1);
	}

}


/*
public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		  
		  PExceptionHandle obj = new PExceptionHandle();
		  obj.CheckException();
		  System.out.println("****   END of program  *****");
		}
	}

*/