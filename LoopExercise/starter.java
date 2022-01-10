import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int num1 = sc.nextInt();
		int rep = 1;
		int rad = 4;
		while(true)
		{
			System.out.println(num1);
			if (rep == rad)
			{
				break;
			}
			rep = rep + 1;
			num1 = num1 + 1;
		}
	}
}