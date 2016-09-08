import javax.swing.JFrame;

public class PClientMain {
	public static void main(String [] args) {
		System.out.println("Chat CLIENT starting..!");
		PChatClient myClient;
		//Server is on same PC - Test
		myClient = new PChatClient("127.0.0.1");
		myClient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myClient.startRunning();
		System.out.println("Chat CLIENT: End of Main()");
	}
}
