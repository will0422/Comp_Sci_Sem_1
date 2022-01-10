import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input A name");
		String name = sc.nextLine();
		System.out.println("Please input the amount of time the name should be repeated");
		int rep = sc.nextInt();
		int rad = 1;
		while (true)
		{
			System.out.println(name);
			if (rep == rad)
		{
		break;
		}
		rad = rad + 1;
		}
	}
}
