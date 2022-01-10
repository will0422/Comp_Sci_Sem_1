import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int c = 0;
		int r;
		while(true){
			r = rand.nextInt(100)+1;
			System.out.println(r);
			c = c + 1;
			if(c == 100){
				break;
			}
		}
	}
}
