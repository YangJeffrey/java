import java.util.Scanner;

public class diceroll {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sides:");
		int sides = input.nextInt(); 
		System.out.println("Dice Roll:");
		double randNumber = Math.random();
		double d = randNumber * sides;
		int randomInt = (int)d + 1;
		System.out.println(randomInt);
	}
}
