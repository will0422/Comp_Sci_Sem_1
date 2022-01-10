import java.util.Scanner;
import java.util.Random;

class starter {
	public static void pows(int base, int power){
		int rep = 1;
		int pow1 = base * base;
		int pow2 = 1;
		int pow3;
		if (power == 0)
		{
			pow2 = 1;
		}
		else
		{
			while(true)
			{
				pow2 = pow2 * base;
				if (rep == power)
				{
					break;
				}
				rep = rep + 1;
			}
		}
		System.out.println(pow2);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int base;
		int power;
		System.out.println("Please enter a number");
		base = sc.nextInt();
		System.out.println("Please enter another number");
		power = sc.nextInt();
		pows(base, power);
	}
}
