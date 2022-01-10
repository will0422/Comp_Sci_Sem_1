import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter in a number");
		int num1 = sc.nextInt();
		System.out.println("Please enter in another number");
		int num2 = sc.nextInt();
		
		//num1
		
		if (num1 % 2 == 0)
		{
			System.out.println("Your first number, " + num1 + ", is even");
		}
		else if (num1 %2 != 0)
		{
			System.out.println("Your first number, " + num1 + ", is odd");
		}
		
		//num2
		
		if (num2 % 2 == 0)
		{
			System.out.println("Your second number, " + num2 + ", is even");
		}
		else if (num2 % 2 != 0)
		{
			System.out.println("Your second number, " + num2 + ", is odd");
		}
		
		//num1
		
		if (num1 % 3 == 0)
		{
			System.out.println("Your first number, " + num1 + ", is divisible by 3");
		}
		else if (num1 % 3 != 0)
		{
			System.out.println("Your first number, " + num1 + ", is not divisible by 3");
		}
		if (num1 % 4 == 0)
		{
			System.out.println("Your first number, " + num1 + ", is divisible by 4");
		}
		else if (num1 % 4 != 0)
		{
			System.out.println("Your first number, " + num1 + ", is not divisible by 4");
		}
		if (num1 % 5 == 0)
		{
			System.out.println("Your first number, " + num1 + ", is divisbile by 5");
		}
		else if (num1 % 5 != 0)
		{
			System.out.println("Your first number, " + num1 + ", is not divisible by 5");
		}
		
		//num2
		
		if (num2 % 3 == 0)
		{
			System.out.println("Your second number, " + num2 + ", is divisible by 3");
		}
		else if (num2 % 3 != 0)
		{
			System.out.println("Your secoond number, " + num2 + ", is not divisible by 3");
		}
		if (num2 % 4 == 0)
		{
			System.out.println("Your second number, " + num2 + ",is divisible by 4");
		}
		else if (num2 % 4 != 0)
		{
			System.out.println("Your second number, " + num2 + ", is not divisible by 4");
		}
		if (num2 % 5 == 0)
		{
			System.out.println("Your second number, " + num2 + ", is divisible by 5");
		}
		else if (num2 % 5 != 0)
		{
			System.out.println("Your second number, " + num2 + ", is not divisible by 5");
		}
		
		
	}
}