import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length;
		int a;
		System.out.println("Enter in your first and last name.");
		String name = sc.nextLine();
		a = name.indexOf(" ");
		a++;
		length = name.length();
		System.out.println(name.substring(a, length));
		
	}
}
