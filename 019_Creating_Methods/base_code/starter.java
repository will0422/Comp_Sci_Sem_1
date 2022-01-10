import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String one){
		System.out.println(one);
	}
	public static void toStringcont(String one, String two){
		System.out.println(one + " " + two);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String one = sc.nextLine();
		System.out.println("Please enter another sentence");
		String two = sc.nextLine();
		toString(one);
		toStringcont(one, two);
	}
}
