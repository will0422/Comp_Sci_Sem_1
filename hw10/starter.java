import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int []x = new int[20];
		int r = rand.nextInt(10) + 1;
		int c = 0;
		int c1 = 0;
		while (c < x.length){
			x[c] = rand.nextInt(10) + 1;
			c++;
		}
		c = 0;
		System.out.print("Duplicates are at indexes: ");
		while (c < x.length){
			if (r == x[c]){
				System.out.print(c + " ");
				c1++;
			}
			c++;
		}
		System.out.println("");
		System.out.println("There are " + c1 + " duplicates");
		c = 0;
		c1 = 1;
		while (c1 < x.length){
			if (x[c] == x[c1]){
				System.out.println("The duplicate numbers in a row are at indexes " + c + ", " + c1 + ". And the number is " + x[c]);
			}
			c++;
			c1++;
		}
	}
}	