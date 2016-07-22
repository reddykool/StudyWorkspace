import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PGuiListCopy extends JFrame {
	private JList leftList;
	private JList rightList;
	private static String[] food = {"Idli", "Dosa", "Vada", "Upma", "Pongal","Puri"};

	private JButton moveButton;
	
	public PGuiListCopy () {
		super("Puru Copy List");
		setLayout(new FlowLayout());
		
		leftList = new JList(food);
		leftList.setVisibleRowCount(3);
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);		
		add(new JScrollPane(leftList));
		
		moveButton = new JButton("Copy-->");
		moveButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rightList.setListData(leftList.getSelectedValues());
					}
				}
			);
		add(moveButton);
		rightList = new JList();
		rightList.setVisibleRowCount(3);
		rightList.setFixedCellHeight(20);
		rightList.setFixedCellWidth(80);
		rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightList));
	}
}

/*
public static void main(String args[]) {
		System.out.println("****   START of program  *****");
	    PGuiListCopy eventObj = new PGuiListCopy();
		eventObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eventObj.setSize(400, 200);
		eventObj.setVisible(true);
		System.out.println("****   END of program  *****");		
	}
*/