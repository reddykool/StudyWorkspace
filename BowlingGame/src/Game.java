import java.awt.DisplayMode;
import java.util.Scanner;

public class Game {
	private int rolls[] = new int[21];
	private int currentRoll =0;
	
	public static void main(String args[])
	{
		Game thisGame = new Game();
		thisGame.playGame();
		thisGame.displayAllFramePins();
		thisGame.score();
	}

	private int getInpuPins(Scanner pinsInput, int frame, String printInfo)
	{
		System.out.printf("Frame : %d, %s: ",frame, printInfo);
		return pinsInput.nextInt();		
	}
	
	private int getFirstBallOfTheFrame(Scanner pinsInput, int frame)
	{
		int ball1 =0;
		ball1 = getInpuPins(pinsInput, frame, "Ball 1");
		while(ball1 > 10){
			System.out.println("Enter CORRECT pins(<=10)");
			ball1 = getInpuPins(pinsInput, frame, "Ball 1");
		}
		return ball1;		
	}

	private int getSecondBallOfTheFrame(Scanner pinsInput, int ball1, int frame)
	{
		int ball2 =0;
		ball2 = getInpuPins(pinsInput, frame, "Ball 2");
		while((ball1+ball2)>10){
			System.out.println("Enter CORRECT pins(Ball 1 + Ball 2 <= 10)");
			ball2 = getInpuPins(pinsInput, frame, "Ball 2");
		}
		return ball2;		
	}

	private boolean isStrikeBall(int ball)
	{
		return ball == 10;
	}
	
	private boolean isSpareBall(int ball1, int ball2)
	{
		return (ball1+ball2)==10 ;
	}
	
	private boolean isLastFrame(int frame)
	{
		return frame == 9;
	}
	
	private void displayAllFramePins()
	{
		int maxFrames = 10;
		int frameIndex = 0;
		int ball1, ball2;
		
		System.out.println("Showing ALL input pins frame-wise...");

		for(int frame = 0; frame < maxFrames; frame++)
		{
			ball1 = rolls[frameIndex++];
			if(isStrikeBall(ball1))
			{
				System.out.printf("[%d]", ball1);
				if(isLastFrame(frame)) {
					ball1 = rolls[frameIndex++];
					System.out.printf("Bonus[%d]", ball1);
					ball1 = rolls[frameIndex++];
					System.out.printf("[%d]", ball1);
				}
				continue;
			}
			else {
				ball2 = rolls[frameIndex++];
				System.out.printf("[%d, %d]", ball1, ball2);
				if(isLastFrame(frame) && isSpareBall(ball1, ball2)) {
					ball1 = rolls[frameIndex++];
					System.out.printf("Bonus[%d]", ball1);
				}
			}
		}
		
	}
	
	public void playGame()
	{
		Scanner pinsInput = new Scanner(System.in);
		int maxFrames = 10;
		int ball1 = 0, ball2 = 0;
		
		for(int frame = 0; frame < maxFrames; frame++) {
			ball1 = getFirstBallOfTheFrame(pinsInput, frame);			
			roll(ball1);
			if(isStrikeBall(ball1))
			{
				if(isLastFrame(frame))
				{
					System.out.println("Last Stike, 2 Bonus Balls...");
					ball1 = getFirstBallOfTheFrame(pinsInput, frame);			
					roll(ball1);
					ball2 = getFirstBallOfTheFrame(pinsInput, frame);
					roll(ball2);
				}
				continue;
			}
			else {
				ball2 = getSecondBallOfTheFrame(pinsInput, ball1, frame);
				roll(ball2);
				if(isLastFrame(frame) && isSpareBall(ball1, ball2)){
					System.out.println("Last Spare, 1 Bonus Ball... ");
					ball1 = getFirstBallOfTheFrame(pinsInput, frame);
				    roll(ball1);
				}
			}
		}
	}

	
	public int score(){
		int score = 0;
		int frameIndex=0;
		for(int frame=0; frame<10; frame++){
			if(isStrike(frameIndex)) {
				score += 10 + strikeBonus(frameIndex);
				frameIndex++;
			}
			else if(isSpare(frameIndex)) {
				score += 10 + spareBonus(frameIndex);
				frameIndex+=2;
			}
			else {
				score += sumOfBallsInFrame(frameIndex);
				frameIndex+=2;
			}
		}
		
		System.out.printf("\nThe FINAL Score is..:%d\n", score);
		return score;
	}

	public void roll(int pins){
		rolls[currentRoll++] = pins;		
	}

	private int sumOfBallsInFrame(int frameIndex)
	{
		return rolls[frameIndex] + rolls[frameIndex+1];
	}
	
	private int strikeBonus(int frameIndex)
	{
		return rolls[frameIndex+1] + rolls[frameIndex+2];
	}

	private int spareBonus(int frameIndex)
	{
		return rolls[frameIndex+2];
	}
	
	private boolean isStrike(int frameIndex)
	{
		return rolls[frameIndex] == 10;
	}	
	
	private boolean isSpare(int frameIndex)
	{
		return rolls[frameIndex]+rolls[frameIndex+1] == 10;
	}
}
