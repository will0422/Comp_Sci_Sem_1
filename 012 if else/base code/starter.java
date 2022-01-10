import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int rand_num1 = rand.nextInt(1000)+1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Guess a number between 1 and 1,000");
		int guess = sc.nextInt();
		boolean x = (guess == rand_num1);
		if(x)
		{
			System.out.println("Congrats! You beat the odds and guessed the right number, which was "+rand_num1+"!");
		}
		else
		{
			System.out.println("OOF! You guessed the wrong number! The right number was "+ rand_num1);
		}
	}
}
