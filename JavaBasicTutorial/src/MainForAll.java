import javax.swing.JFrame;

public class MainForAll {
	
	public static void main(String args[]) {
		System.out.println("****   START of program  *****");
		PGuiRadioButton obj = new PGuiRadioButton();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(300, 300);
		obj.setVisible(true);
		System.out.println("****   END of program  *****");	
	}
}
