import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c = 0;
		System.out.println("Enter in a phrase");
		String phrase = sc.nextLine();
		System.out.println(phrase);
		int length = phrase.length();
		while (c < length){
			a = phrase.indexOf(" ");
			b = phrase.indexOf(" ", a);
			c++;
		}
		String []arr = new String [c];
		System.out.println(phrase.substring(a, length) + " " + phrase.substring(0, a));
	}
}
