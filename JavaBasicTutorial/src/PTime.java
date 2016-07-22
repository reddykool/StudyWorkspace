
public class PTime {
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int hh, int mm, int ss) {
		hour = (hh>=0 && hh<24)?hh:0;
		minute = (mm>=0 && mm<60)?mm:0;
		second = (ss>=0 && ss<60)?ss:0;
		
		System.out.printf("SetTime is for %s\n", this);
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute,second);
	}

	public String  toNormal() {
		return String.format("%d:%02d:%02d %s",((hour==0 || hour==12)?12:hour%12), minute, second, (hour>=12?"PM":"AM"));
	}
	
	public String toString() {
		return String.format("%d:%d:%d", hour, minute, second);
	}
}

/*
public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		  
		  PTime time1 = new PTime();
		  PTime time2 = new PTime();
		  time1.setTime(21, 45, 53);
		  time2.setTime(15, 67, 89);
		  
		  System.out.println("\nMiliatary time1 : " + time1.toMilitary());
		  System.out.println("Normal time1 : " + time1.toNormal());
		  
		  System.out.println("\nMiliatary time2 : " + time2.toMilitary());
		  System.out.println("Normal time2 : " + time2.toNormal());
		  
		  System.out.println("****   END of program  *****");
		}
	 
}

*/