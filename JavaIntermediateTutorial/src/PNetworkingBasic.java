import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

//1. Applet code saved as xyz.html 
/*
<html>
<head>
    <title>Network Applet</title>
</head>
<body> Opening web links
    <applet 
        code="PNetworkingBasic.class" 

        width="300" 
        height="300">
        <param name="title0" value="thenewboston Blog">
        <param name="address0" value="http://thenewboston.org">
        <param name="title1" value="My Blog">
        <param name="address1" value="http://reddykool.blogspot.com">

        Your Browser has not enabled Java !?!
             OR
        Your java security has disabled opening local files as applet !?! 

        + Enable java in your Browser :
        * https://java.com/en/download/help/enable_browser.xml 

        + Edit security settings:         
          Follow below steps in UBUNTU
          * open java Control panel
          * /usr/lib/jvm/java-8-oracle/bin$ ./ControlPanel
          * Go to secuirty tab
          * add "file:///" to exception list
          * press apply/Ok
        + now retry to run applet. 

    </applet>
</body>
</html>
*/

//2. copy .class files to same location where you have .html

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
