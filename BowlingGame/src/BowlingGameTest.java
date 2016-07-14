import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {

	//@Test
	//
	private Game g;
	
	protected void setUp() throws Exception{
		System.out.println("Setup...");
		g = new Game();
	}
	
	private void rollMany(int n, int pins){
		System.out.println("rollMany...");
		for(int i=0; i<n; i++)
			g.roll(pins);
	}
	
	public void testGutterGame() throws Exception {	
		System.out.println("testGutterGame...");
		int n=20;
		int pins = 0;
		rollMany(n, pins);
		assertEquals(0, g.score());
	}
	
	public void testAllOnes() throws Exception {
		System.out.println("testAllOnes...");
		int n=20;
		int pins = 1;
		rollMany(n, pins);
		assertEquals(20, g.score());
	}
	
	//
	public void testOneSpare() throws Exception {
		System.out.println("testOneSpare...");
		rollSpare(6,4);
		g.roll(3);      
		rollMany(17, 0); //Remaining games
		assertEquals(16, g.score());
	}
	
	public void testOneStrike() throws Exception {
		System.out.println("testOneStrike...");
		rollStrike();
		g.roll(3);
		g.roll(4);
		rollMany(16, 0); //Remaining games
		assertEquals(24, g.score());
	}

	public void testPerfectStrikeGame() throws Exception {
		System.out.println("testPerfectStrikeGame...");
		rollMany(12, 10);
		assertEquals(300, g.score());
	}
	
	public void testPerfectSpare5Game() throws Exception {
		System.out.println("testPerfectSpare5Game...");
		rollMany(21, 5);
		assertEquals(150, g.score());
	}
	
	public void testRandomPins() throws Exception {
		System.out.println("testRandomPins...");
		g.roll(0);
		g.roll(7);
		g.roll(3);
		g.roll(2);
		rollMany(16, 2);
		assertEquals(44, g.score());
	}

	private void rollStrike() {
		System.out.println("rollStrike...");
		g.roll(10);
	}

	
	private void rollSpare(int pin1, int pin2) {
		System.out.printf("rollSpare:%d,%d\n", pin1, pin2);
		g.roll(pin1);
		g.roll(pin2);
	}
	
	/*
	private void justOneSpare() {
		System.out.println("justOneSpare...");
	}
	*/
}
