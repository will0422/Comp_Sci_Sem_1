import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose class: Wizard, Warrior, or Rogue");
		String role = sc.nextLine();
		myCharacter test = new myCharacter();
		myCharacter test2 = new myCharacter(role);
		test2.setRole(role);
		test2.myToString();
	}
}