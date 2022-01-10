import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int c = 1;
		int r;
		int c1 = 1;
		int [] a = new int[1000];
		while (true){
			r = rand.nextInt(1000)+1;
			a[c] = r;
			c = c + 1;
			if (c == 1000){
				break;
			}
		}
		while (true){
			System.out.println(a[c1]);
			c1 = c1 + 1;
			if (c1 == 1000){
				break;
			}
		}
	}
}
