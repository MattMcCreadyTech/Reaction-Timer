import java.util.Scanner;

public class ReactionTimer {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("3");
		Thread.sleep(1000); //time between numbers (1000ms = 1 second)
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);

		System.out.println("GO!!!!!!");
		long startTime = System.currentTimeMillis(); //stores current time in startTime variable

		Scanner scanner = new Scanner(System.in); //user input
		scanner.next();
		long stopTime = System.currentTimeMillis(); //stop clock

		long reactionTime = stopTime - startTime; //difference between times

		System.out.println(reactionTime + "ms");

		scanner.close();
	}
}
