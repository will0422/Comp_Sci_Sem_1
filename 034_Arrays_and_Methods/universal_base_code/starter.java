import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] x){
		int c = 0;
		while(c < x.length){
			System.out.print(x[c]+" ");
			c++;
		}
		return;
	}
	public static int getArrayAverage(int[] x){
		int c = 0;
		int total = 0;
		while(c < x.length){
			total = total + x[c];
			c++;
		}
		int avg = total / x.length;
		return avg;
	}
	public static int getArrayMax(int[] x){
		int c = 0;
		int max = -2147483648;
		while(c < x.length){
			if(x[c] > max){
				max = x[c];
			}
			c++;
		}
		return max;
	}
	public static int getArrayMin(int[] x){
		int c = 0;
		int min = 2147483647;
		while (c < x.length){
			if(x[c] < min){
				min = x[c];
			}
			c++;
		}
		return min;
	}
	public static void main(String args[]) {
		int []num = new int [100];
		Random rand = new Random();
		int c = 0;
		while(c < num.length){
			num[c] = rand.nextInt(100) + 1;
			c++;
		}
		System.out.println("The elements in the array are ");
		toStringArray(num);
		System.out.println("");
		System.out.println("The average of these elements is " + getArrayAverage(num));
		System.out.println("The max of these elements is " +  getArrayMax(num));
		System.out.println("The minimum of these elements is " + getArrayMin(num));
		
	}
}
