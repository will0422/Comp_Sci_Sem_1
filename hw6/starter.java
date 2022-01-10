import java.util.Scanner;
import java.util.Random;

class starter {
	public static boolean checkPrime(int num){
		int count = num - 1;
		while(count > 1){
			if (num % count == 0){
				return false;
			}
			count = count - 1;
		}
		return true;
	}
	public static void printPrime(int num){
		int count = num;
		while (true){
			if (count == 1){
				break;
			}
			boolean check2 = checkPrime(count);
			if(check2){
				System.out.println(count);
			}
			count = count - 1;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Input a number and we'll output all the prime numbers until that number");
		int num;
		num = sc.nextInt();
		if (num == 1 || num == 0){
			System.out.println("STOP MR.POOLE");
			return;
		}
		printPrime(num);
	}
}