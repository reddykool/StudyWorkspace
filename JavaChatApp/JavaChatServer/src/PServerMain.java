import javax.swing.JFrame;

public class PServerMain {
	public static void main(String [] args) {
		System.out.println("Chat SERVER starting..!");
		PChatServer myServer = new PChatServer();
		myServer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myServer.startRunning();
		System.out.println("Chat SERVER : End of Main()");
	}
}
