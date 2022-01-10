import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Hello, My name is Scanner, and I will need you to answer a few questions for me, and I will write you an introductory paragraph! To do so, wait for the questions to appear then type your answer into the console!"); 
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What is the number of the month you were born?");
		int month = sc.nextInt();
		System.out.println("What is the number of the day you were born?");
		int day = sc.nextInt();
		System.out.println("What is your Birth Year?");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double buck = sc.nextDouble();
		System.out.println("Hello, my name is " + name + "." + " I am " + age + " years old!" + " I was born " + month + "/" + day + "/" + year + "." + " A buck fifty is " + "$" + buck + "0.");
		
	}
}
