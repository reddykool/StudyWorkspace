
public class compoundInterest {
    //formula A=P(1+R)^n
	double amount;
	double principal=10000;
	double rate=0.01;
	
	public void show(){
	for(int day =1 ; day <= 20; day++) {
		amount = principal*Math.pow(1+rate, day);
		System.out.println(day + "   " + amount);		
	}
	}
}


/*
  public static void main(String args[]) {
	  System.out.println("****   START of program  *****");
	  
	  compoundInterest cmpIn = new compoundInterest();
	  cmpIn.show();
	  
	  System.out.println("****   END of program  *****");
	}

*/
