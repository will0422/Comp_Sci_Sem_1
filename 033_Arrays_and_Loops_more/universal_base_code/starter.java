import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int c = 0;
		int min = 1000;
		int max = 0;
		int t = 0;
		int avg;
		int x = rand.nextInt(149) + 51;
		int []num = new int[x];
		System.out.println("There are " + x + " elements.");
		while (c < num.length){
			num[c] = rand.nextInt(100);
			c++;
		}
		c = 0;
		while (c < num.length){
			if (num[c] < min){
				min = num[c];
			}
			c++;
		}
		System.out.println("The minimum is " + min);
		c = 0;
		while (c < num.length){
			if(num[c] > max){
				max = num[c];
			}
			c++;
		}
		c = 0;
		System.out.println("The maximum is " + max);
		while (true){
			t = t + num[c];
			c++;
			if (c == num.length){
				break;
			}
		}
		avg = t/x;
		System.out.println("The average is " + avg);
	}
}
