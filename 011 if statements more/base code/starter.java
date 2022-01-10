import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		//Scanner sc = new Scanner (System.in);
		//System.out.println("Please type in 1 number");
		//int num1 = sc.nextInt();
		//System.out.println("Please type in another number");
		//int num2 = sc.nextInt();
		//boolean x = (num1 != num2);
		//if(x)
		//{
		//	System.out.println("The two numbers are different");
		//}
		//boolean s = (num1 == num2);
		//if(s)
		//{
		//	System.out.println("the two numbers are the same");
		//}
		//PART 2
		Scanner sc = new Scanner (System.in);
		System.out.println("Please type in a number");
		int num1 = sc.nextInt();
		System.out.println("Please type in another number");
		int num2 = sc.nextInt();
		System.out.println("Please type in the last number");
		int num3 = sc.nextInt();
		boolean x = ((num1 > num2) && (num1 > num3));
		if(x)
		{
			System.out.println("The largest number is "+num1);
		}
		boolean s = ((num2 > num1) && (num2 > num3));
		if(s)
		{
			System.out.println("The largest number is "+num2);
		}
		boolean d = ((num3 > num1) && (num3 > num2));
		if(d)
		{
			System.out.println("The largest number is "+num3);
		}
		boolean w = ((num1 < num2) && (num1 < num3));
		if(w)
		{
			System.out.println("The smallest number is "+num1);
		}
		boolean q = ((num2 < num1) && (num2 < num3));
		if(q)
		{
			System.out.println("The smallest number is "+num2);
		}
		boolean f = ((num3 < num2) && (num3 < num1));
		if(f)
		{
			System.out.println("The smallest number is "+num3);
		}
	}
}
