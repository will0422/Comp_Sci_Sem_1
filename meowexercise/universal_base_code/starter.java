import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name your cat");
		String catname = sc.nextLine();
		Cat test = new Cat(catname);		
		System.out.println(name + " and Garfield meow at each other");
		test.meow();
	}
}
