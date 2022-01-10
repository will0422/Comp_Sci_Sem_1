import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String type;
		String name;
		int number;
		System.out.println("Enter in a type of Ascii art, Human, Dog, Cactus, Penis, or Other");
		type = sc.nextLine();
		System.out.println("Enter in the Ascii art name");
		name = sc.nextLine();
		System.out.println("Enter in the amount of times it should be printed");
		number = sc.nextInt();
		Ascii test = new Ascii();
		Ascii test2 = new Ascii(type, name, number);
		test2.printArt();

	}
}
