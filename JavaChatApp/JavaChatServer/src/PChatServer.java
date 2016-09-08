import java.io.*; 
import java.net.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PChatServer extends JFrame {
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	public PChatServer() {
		super("Redzz-ChatServer");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {	
						sendMessage(event.getActionCommand());
						userText.setText("");
					}
				}
			);
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(400,600);
		setVisible(true);
	}
	
	//set up and run server
	public void startRunning() {
		try {
			server = new ServerSocket(6789, 100); //(port num, How many ppl)
			while(true) {
				try {
					waitForConnection();
					setupStreams();
					whileChatting();
				} catch (EOFException eofExcp) {
					showMessage("\n Server ended the connection..!");
				} finally {
					closeServer();
				}
			}
		} catch (Exception ioExp) {
			ioExp.printStackTrace();
		}
	}
	
	//wait for connection, then display connection information
	private void waitForConnection() throws IOException {
		showMessage("\n Waiting for someone to connect..!");
		connection = server.accept();
		showMessage("\n Now connected..! to " + connection.getInetAddress().getHostName());
	}
	
	//setup streams for communication pathway with others
	private void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are now setUp\n");
	}
	
	//during the chat conversation
	private void whileChatting() throws IOException {
		String message = "You are now connected!";
		sendMessage(message);
		ableToType(true);
		
		do {
			try {
				message = (String) input.readObject();
				showMessage("\n" + message);
			} catch (ClassNotFoundException classNotfoundExp) {
				showMessage("\n not found class ..\n");
			}
		}while(!message.equals("CLIENT - END"));
	}
	
	//close connections
	private void closeServer() {
		showMessage("\n Closing Connections...xxx \n");
		ableToType(false);
		try {
			output.close();
			input.close();
			connection.close();
		} catch (IOException ioExp) {
			ioExp.printStackTrace();
		}
	}
	
	//send message to others
	private void sendMessage(String sendMsg) {
		try {
			output.writeObject("SERVER - " + sendMsg);
			output.flush();
			showMessage("\nSERVER - " + sendMsg);
		} catch (IOException IoExp) {
			chatWindow.append("\n ERROR: Cant Sent Message\n");
		}
	}
	
	//show messages in chat window
	private void showMessage(final String showMsg) {
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						chatWindow.append(showMsg);
					}
				}
			);
	}

	//enable/disable edit in chat type area
	private void ableToType(final boolean state) {
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						userText.setEditable(state);
					}
				}
			);		
	}
}