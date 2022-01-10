import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a class: wizard, warrior, or rogue.");
		String c1 = sc.nextLine();
		String wiz = new String("wizard");
		String war = new String("warrior");
		String rog = new String("rogue");
		String wiz1 = new String("Wizard");
		String war1 = new String("Warrior");
		String rog1 = new String("Rogue");
		if((wiz.equals(c1)) || (wiz1.equals(c1)))
		{
		System.out.println("You are a "+c1);
		}
		else if((war.equals(c1)) || (war1.equals(c1)))
		{
		System.out.println("You are a "+c1);
		}
		else if((rog.equals(c1)) || (rog1.equals(c1)))
		{
		System.out.println("You are a "+c1);
		}
		else
		{
		System.out.println("Your input is incorrect, try again!");
		}
	}
}
