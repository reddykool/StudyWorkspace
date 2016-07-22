import javax.swing.JFrame;

public class MainForAll {
	
	  public static void main(String args[]) {
		  System.out.println("****   START of program  *****");
		  
			PGuiComboBox eventObj = new PGuiComboBox();
			eventObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			eventObj.setSize(400, 200);
			eventObj.setVisible(true);
		  
		  System.out.println("****   END of program  *****");
		}
	}
