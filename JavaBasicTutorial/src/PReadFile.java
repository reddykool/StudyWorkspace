import java.io.File;
import java.util.Scanner;

public class PReadFile {
	private Scanner x;
	final String pathName = "/home/reddyz/workspace/JavaStudyWorkspace/JavaBasicTutorial/misc/PuRu.txt";
	
	public void openFile() {
		System.out.println("File path: " + pathName);
		try {
			x= new Scanner(new File(pathName));
		}
		catch(Exception e) {
			System.out.println("File not found xxx");
		}
	}
	
	public void readFile() {
		System.out.println("\n++++Reading from file...");
		while(x.hasNext()) {
			String a = x.nextLine();
			System.out.println(a);
		}
		System.out.println("++++End of file...\n");
	}
	
	public void closeFile() {
		x.close();
	}

}

/*
public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		  
		  PReadFile fl = new PReadFile();
		  fl.openFile();
		  fl.readFile();
		  fl.closeFile();
		  
		  System.out.println("****   END of program  *****");
		}
	}
*/