import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a character name!");
		String name = sc.nextLine();
		System.out.println("Please enter a chracter title!(ex: Ultimate Strategist)");
		String title = sc.nextLine();
		System.out.println("Choose a class: wizard, warrior, or rogue.");
		String wiz = new String("wizard");
		String war = new String("warrior");
		String rog = new String("rogue");
		String wiz1 = new String("Wizard");
		String war1 = new String("Warrior");
		String rog1 = new String("Rogue");
		int rep = 1;
		int rad = 1;
		String c1;
		while(true)
		{
		c1 = sc.nextLine();
		if((wiz.equals(c1)) || (wiz1.equals(c1)))
		{
			System.out.println("You are a "+c1);
			break;
		}
		else if((war.equals(c1)) || (war1.equals(c1)))
		{
			System.out.println("You are a "+c1);
			break;
		}
		else if((rog.equals(c1)) || (rog1.equals(c1)))
		{
			System.out.println("You are a "+c1);
			break;
		}
		else
		{
			System.out.println("That is not a class that you can select! Please choose a class! Wizard, Warrior, Rogue");
		}
		}
		System.out.println("Please assign up to 10 points into these 5 categories. You have 25 points to assign, choose wisely.");
		while (true)
		{
			int pts = 25;
			System.out.println("Assign 1-10 points to Strength (Buff, and ability to carry larger items)");
			int strgth = sc.nextInt();
			if ((pts) < 0)
			{
				System.out.println("You went over your spending limit, please try again");
			}
			if (10 < (strgth))
			{
				System.out.println("You went over the limit, try again.");
			}
			else
			{
				System.out.println("You've assigned "+strgth+" points to Strength!");
				pts = (pts - strgth);
				System.out.println("You have "+pts+" points remaining.");
				System.out.println("Assign 1-10 points to Dexterity (Agile and moves quick)");
				int dext = sc.nextInt();
				if ((pts) < 0)
				{
					System.out.println("You went over your spending limit, please try again");
				}
				else if (10 < (dext))
				{
					System.out.println("You went over the limit, please try again.");
				}
				else
				{
					System.out.println("You've assigned "+dext+" points to Dexterity!)");
					pts = (pts - dext);
					System.out.println("You have "+pts+" points remaining.");
					System.out.println("Please assign 1-10 points to Intelligence (Better at magic skills)");
					int intel = sc.nextInt();
					pts = (pts - intel);
					if ((pts) < 0)
					{
						System.out.println("You went over your spending limit, please try again");
					}
					else if (10 < (intel))
					{
						System.out.println("You went over the limit, please try again.");
					}
					else
					{
						System.out.println("You've assigned "+intel+" points to Intelligence!");
						System.out.println("You have "+pts+" points remaining.");
						System.out.println("Please assign 1-10 points to Constitution (Health)");
						int cons = sc.nextInt();
						pts = (pts - cons);
						if ((pts) < 0)
						{
							System.out.println("You went over your spending limit, please try again");
						}
						else if (10 < (cons))
						{
							System.out.println("You went over the limit, please try again.");
						}
						else
						{
							System.out.println("You've assigned "+cons+" points to Constitution!");
							System.out.println("You have "+pts+" points remaining.");
							System.out.println("Please assign 1-10 points to Charisma (How personable)");
							int chari = sc.nextInt();
							pts = (pts - chari);
							if ((pts) < 0)
							{
								System.out.println("You went over your spending limit, please try again");
							}
							else if (10 < (chari))
							{
								System.out.println("You went over the limit, please try again.");
							}
							else
							{
								System.out.println("You've assigned "+chari+" points to Charisma!");
								System.out.println("You have "+pts+" points left over!");
								System.out.print("Hello there "+name+". You are the "+title+". You are the "+c1+" of deez. You've assigned "+strgth+" points to strength, "+dext+" points to Dexterity, "+intel+" points to Intelligence, "+cons+" points to Constitution, and "+chari+" points to Charisma.");
							}
								if (rep == rad)
							{
								break;
							}
						}
					}
				}
			}
		}
	}
}
