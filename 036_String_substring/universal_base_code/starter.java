import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c = 1;
		int r = 0;
		System.out.println("Enter in a word");
		String x = sc.nextLine();
		while (true){
			System.out.println(x.substring(r, c));
			c++;
			r++;
		}
	}
}
