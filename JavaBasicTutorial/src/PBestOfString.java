
public class PBestOfString {

	public void run() {
		String a = "Apples";
		String b = "Billions";
		String c = "Crores";
		String d = "CRORES";
		String e = "lions";
		
		System.out.println(a.length());
		
		if(a.equals("Apples")) {
			System.out.println(a + " equals Apples!");
		}
		
		if(a.equals(b)) {
			System.out.println(a + " equals " + b);
		}		

		if(b.contains(e)) {
			System.out.println(b + " contians " + e);
		}
		
		if(c.equalsIgnoreCase(d)) {
			System.out.println(c + " equals " + d);
		}
		

	}
}

/*
public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		 
		  PBestOfString obj = new PBestOfString();
		  obj.run();
		  
		  System.out.println("****   END of program  *****");
		}
	}
*/