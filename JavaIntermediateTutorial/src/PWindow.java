import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PWindow extends JFrame{
	
	private JSlider slider;
	private PDrawOval myPanel;
	
	public PWindow() {
		super.setTitle("Draw Oval");
		myPanel = new PDrawOval();
		myPanel.setBackground(Color.CYAN);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 150, 25);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener() {
					@Override
					public void stateChanged(ChangeEvent e) {
						myPanel.setDia(slider.getValue());
					}
				}
			);
		
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}
}
