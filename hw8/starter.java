import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int x;
		int c = 0;
		int []a = new int[20];
		int []b = new int[20];
		while (c < 20){
			a[c] = rand.nextInt(50);
			b[c] = rand.nextInt(50);
			c++;
		}
		c = 0;
		while (c < 20){
			System.out.println(a[c]);
			c++;
		}
		x = 20;
		c = x;
		while (c < 20){
			System.out.println(b[c]);
			c--;
		}
	}
}