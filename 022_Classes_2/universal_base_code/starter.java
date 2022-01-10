import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter playchar = new myCharacter();
		System.out.println("Your role is " + playchar.wiz);
		System.out.println("Strength is " + playchar.strgth);
		System.out.println("Dexterity is " + playchar.dext);
		System.out.println("Intelligence is " + playchar.intel);
		System.out.println("Constitution is " + playchar.cons);
		System.out.println("Charisma is " + playchar.chari);
	}
}
