import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String yes1 = new String("Yes");
		String yes2 = new String("yes");
		String yes3 = new String("Y");
		String yes4 = new String("y");
		String no1 = new String("No");
		String no2 = new String("no");
		String no3 = new String("N");
		String no4 = new String("n");
		int bal = 100;
		System.out.println("Welcome to the Slot Machine!");
		System.out.println("Here are the rules:");
		System.out.println("The slot machine will roll 3 random numbers.");
		System.out.println("If two numbers are the same, it doubles your money wagered. If three numbers are the same, it’s a jackpot. If none are the same, you lose the money.");
		System.out.println("If you would like to play please type Yes/yes/Y/y");
		System.out.println("If you would not like to play, please type No/no/N/n");
		while (true)
		{
			int n1 = rand.nextInt(10)+1;
			int n2 = rand.nextInt(10)+1;
			int n3 = rand.nextInt(10)+1;
			if (bal == 0)
			{
				System.out.println("You ran out of money, better luck next time!");
				return;
			}
			String cons = sc.nextLine();
			if ((cons.equals(yes1)) || (cons.equals(yes2)) || (cons.equals(yes3)) || (cons.equals(yes4)))
			{
				System.out.println("Awesome! You have $" + bal + " How much would you like to bet?");
				int bet = sc.nextInt();
				if (bet <= 0)
				{
					System.out.println("You cannot input a number equal to or less than 0, please try again");
					System.out.println("If you would like to play again please type Yes/yes/Y/y");
					System.out.println("If you would not like to play again, please type No/no/N/n");
				}
				else if (bet <= bal)
				{
					bal = bal - bet;
					System.out.println("Cool! Your numbers are");
					System.out.println("---------------");
					System.out.println(" | " + n1 + " | " + n2 + " | " + n3 + " |");
					System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
					if ((n1 == n2) && (n1 == n3) && (n2 == n3))
					{
						System.out.println("JACKPOT!!! YOUR BETTED MONEY IS TRIPLED!");
						bet = bet * 3;
						bal = bet + bal;
						System.out.println("If you would like to play again please type Yes/yes/Y/y");
						System.out.println("If you would not like to play again, please type No/no/N/n");
					}
					else if ((n1 == n2) || (n1 == n3) || (n2 == n3))
					{
						System.out.println("Congratulations, Your betted money is doubled!");
						bet = bet * 2;
						bal = bet + bal;
						System.out.println("You now have $" + bal);
						System.out.println("If you would like to play again please type Yes/yes/Y/y");
						System.out.println("If you would not like to play again, please type No/no/N/n");
					}
					else
					{
						System.out.println("Didn't win this time, try again next time!");
						System.out.println("You now have $" + bal);
						if (bal == 0)
						{
							System.out.println("You have no more money, better luck next time!");
							return;
						}
						else if (bal > 0)
						{
							System.out.println("If you would like to play again please type Yes/yes/Y/y");
							System.out.println("If you would not like to play again, please type No/no/N/n");
						}
					}
				}
				else if (bet > bal)
				{
					System.out.println("You do not have that much money, please try again");
					System.out.println("If you would like to play again please type Yes/yes/Y/y");
					System.out.println("If you would not like to play again, please type No/no/N/n");
				}
			}
			else if ((cons.equals(no1)) || (cons.equals(no2)) || (cons.equals(no3)) || (cons.equals(no4)))
			{
				System.out.println("Awwwww, Sad to see you go! Come back again soon! You have $" + bal);
				return;
			}
			else 
			{
				System.out.println("Input Yes/yes/Y/y, or No/no/N/n");
			}
		}
	}
}