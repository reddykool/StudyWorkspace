import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PChatClient extends JFrame {
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String ServerIP;
	private Socket connection;
	
	//constructor
	public PChatClient(String host) {
		super("Redzz-ChatClient");
		ServerIP = host;
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
		add(new JScrollPane(chatWindow), BorderLayout.CENTER);
		setSize(350,500);
		setVisible(true);
	}
	
	//connect to server
	public void startRunning() {
		try {
			connectToServer();
			setupStreams();
			whileChatting();
		} catch (EOFException eofExp) {
			showMessage("\n CLeint terminated the connection");
			eofExp.printStackTrace();
		} catch (IOException ioExp) {
			ioExp.printStackTrace();
		} finally {
			closeClient();
		}
	}
	
	//Connect to Server
	private void connectToServer() throws IOException {
		showMessage("Attempting Connection...\n");
		connection = new Socket(InetAddress.getByName(ServerIP), 6789);
		showMessage("Conected to: "+ connection.getInetAddress().getHostAddress());
	}
	
	//setup streams to send/receive messages
	private void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Your streams are Up !");
	}
	
	//chatting
	private void whileChatting() throws IOException {
		ableToType(true);
		do {
			try {
				message =(String) input.readObject();
				showMessage("\n" + message);
			} catch (ClassNotFoundException excp) {
				showMessage("\n object type uknown?");
			}
		}while(!message.equals("SERVER - END"));
	}
	
	//close the streams
	private void closeClient() {
		showMessage("\n closing client...");
		ableToType(false);
		try {
			output.close();
			input.close();
			connection.close();
		} catch (IOException ioExcp) {
			ioExcp.printStackTrace();
		}
	}
	
	//send messages to server
	private void sendMessage(String msg) {
		try {
			output.writeObject("CLIENT - " + msg);
			output.flush();
			showMessage("\nCLIENT - " + msg);
		} catch (IOException ioExcp) {
			chatWindow.append("\nERROR: Message not sent...!");
		}
	}
	
	//update chat window
	private void showMessage(final String msg) {
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						chatWindow.append(msg);
					}
				}
			);
	}
	
	//enable/disable typing 
	private void ableToType(boolean state) {
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						userText.setEditable(state);
					}
				}
			);		
	}
}
