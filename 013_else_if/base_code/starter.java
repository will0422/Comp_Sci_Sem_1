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
			System.out.print("Congrats! You beat the odds and guessed the right number");
		}
		else if(x=(rand_num1 > guess))
		{
			System.out.print("OOF! You guessed the wrong number! Your guess was smaller than the random number!");
		}
		else
		{
			System.out.print("OOF! You guessed the wrong number! Your guess was larger than the random number!");
		}
		System.out.println(" The number was "+rand_num1+"!");
	}
}
