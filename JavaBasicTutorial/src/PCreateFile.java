import java.io.File;
import java.util.*;

public class PCreateFile {
	private Formatter x;
	String fileName = "/home/reddyz/workspace/JavaStudyWorkspace/JavaBasicTutorial/misc/PuRu.txt";
	
	public void fileCheck(){
		File fl = new File(fileName);
		System.out.println("File path: " + fileName);
		if(fl.exists()) { 
			System.out.println(fl.getName() +" Exists ++++");
		}
		else {
			System.out.println(fl.getName() + " Does not Exists xxxxx");
		}

	}
	public void openFile() {
		try {
			x = new Formatter(fileName);
			System.out.println("Created a file");
			}
		catch (Exception e) {
			System.out.println("Youh have file creation Error...");
		}
	}
	
	public void addRecords() {
		x.format("%s", "35 \t Reddyz \t Millionaire");
		x.format("\n%s", "Professional IT\nEntrepreneurial Businessman");
		System.out.println("Added few records to file...");
	}
	
	public void closeFile() {
		x.close();
	}
}

/*
public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		  
		  PCreateFile fl = new PCreateFile();
		  fl.fileCheck();
		  fl.openFile();
		  fl.addRecords();
		  fl.closeFile();
		  
		  System.out.println("****   END of program  *****");
		}
*/