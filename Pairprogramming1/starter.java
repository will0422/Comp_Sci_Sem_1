import java.util.Scanner;
import java.util.Random;

class starter {
	public static void factorial(int fact){
		int yer = fact;
		while (true)
		{
			yer = yer - 1;
			fact = fact * yer;
			if (yer == 1)
			{
				break;
			}
		}
		System.out.println(fact);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in an integer");
		int fact = sc.nextInt();
		factorial(fact);
	}
}