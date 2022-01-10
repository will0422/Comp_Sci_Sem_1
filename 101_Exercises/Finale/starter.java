import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int mode = -1;
		int c = 1;
		public int[] getMode(int[] num){
			int length = num.length();
			int c1 = 0;
			int c2;
			int c3 = 0;
			while(c < length){
				if (c3 == length){
					c++;
					c3 = 0;
				}
				if (num[c] == num[c3]){
					c1++;
					c2 = num[c];
				}
				c3++;
			}
			if (c2 > mode){
				return c2;
			}
			else{
				return mode;
			}
		}
		public int[] getMedian(int[] num){
			c = 0;
			int median = 0;
			int length2 = num.length;
			while(c < num.length()){
				median = median + num[c];
			}
			median = median/length2;
			return median;
		}
		int []arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
		int []arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int []arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
		int mode1 = getMode(arr1);		//The value of mode1 is 5.
		int mode2 = getMode(arr2);		//The value of mode2 is 7
		int mode3 = getMode(arr3);		// The value of mode3 is -1.

		int []arr4 = {1, 2, 3, 4, 5, 6, 7};
		int []arr5 = {1, 2, 3, 4, 5, 6};
		int median1 = getMedian(arr4);  	//The value of median1 is 4.
		int median2 = getMedian(arr5);	//The value of median2 is 3.
	}
}
