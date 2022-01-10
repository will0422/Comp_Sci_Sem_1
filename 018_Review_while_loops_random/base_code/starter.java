import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rand_num = rand.nextInt(1000)+1;
		System.out.println("Here's the game, guess a number between 1-1000, and if you can guess the random number, you win!");
		System.out.println(rand_num);
		int guess;
		while(true)
		{
			guess = sc.nextInt();
			if (guess == rand_num)
			{
				System.out.println("Congratulations, you guessed the number! YOU WIN!!!!!!!!!");
				break;
			}
			else
			{
				System.out.println("You guessed the wrong number, please try again.");
			}
		}
	}
}
