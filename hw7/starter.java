import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Dog puppy1 = new Dog("Gian", 7);
		Dog puppy2 = new Dog("Paolo", "Weiner");
		System.out.println(puppy1.getName());
		System.out.println(puppy1.getAge());
		System.out.println(puppy2.getBreed());
		if (puppy1.isSleeping()){
			System.out.println(puppy1.getName() + " is asleep");
		}
		else{
			puppy1.bark();
			puppy2.bark();
		}
		
	}
}
