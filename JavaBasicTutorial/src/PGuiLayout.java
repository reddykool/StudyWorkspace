import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class PGuiLayout extends JFrame{
	
	private JButton lb, cb, rb;
	private JRadioButton rbt;
	private FlowLayout layout;
	private Container container;
	
	public PGuiLayout() {
		super("Puru Layout");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		rbt = new JRadioButton("Dummy");
		add(rbt);
		
		lb = new JButton("Left");
		add(lb);
		lb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
				);

		cb = new JButton("Centre");
		add(cb);
		cb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
				);
	
		rb = new JButton("Right");
		add(rb);
		rb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
				);
		
	}

}
