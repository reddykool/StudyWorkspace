import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class PGuiListSimple extends JFrame  {
	private JList list;
	private static String[] colorNames = {"Black", "Blue", "Red", "Green", "Yellow"};
	private static Color[] colors ={Color.BLACK, Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW};
	
	public PGuiListSimple () {
		super("Puru Simple JList");
		setLayout(new FlowLayout());
		
		list = new JList(colorNames);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(new JScrollPane(list));
				
		list.addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
				}
			);
	}
	
}


/*

public static void main(String args[]) {
	System.out.println("****   START of program  *****");
	PGuiListSimple eventObj = new PGuiListSimple();
	eventObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	eventObj.setSize(400, 200);
	eventObj.setVisible(true);
	System.out.println("****   END of program  *****");	
}

*/