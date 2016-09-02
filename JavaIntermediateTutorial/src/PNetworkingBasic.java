import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class PNetworkingBasic extends JApplet{
	
	private HashMap<String, URL> webInfo;
	private ArrayList<String> titles;
	private JList mainList;

	//init
	public void init() {
		webInfo = new HashMap<String, URL>();
		titles = new ArrayList<String>();
		
		grabHTMLInfo();
		add(new JLabel("CLick on the websites below"), BorderLayout.NORTH);
		mainList = new JList(titles.toArray());
		
		mainList.addListSelectionListener(
				new ListSelectionListener() {
					@Override
					public void valueChanged(ListSelectionEvent e) {
						Object obj = mainList.getSelectedValue();
						URL newDoc = webInfo.get(obj);
						
						//get the current browser on which applet is running to open url
						AppletContext browser = getAppletContext();
						browser.showDocument(newDoc);
					}
				}
			
			);
		add(new JScrollPane(mainList), BorderLayout.CENTER);
	}
	
	private void grabHTMLInfo() {
		String title, address;
		URL url;
		int counter = 0;
		
		title = getParameter("title"+counter);
		while(title != null) {
			address = getParameter("address"+counter);
			try {
				url = new URL(address);
				webInfo.put(title, url);
				titles.add(title);
			}catch(MalformedURLException urlException) {
				urlException.printStackTrace();
			}
			counter++;
			title = getParameter("title"+counter);
		}
	}
}
