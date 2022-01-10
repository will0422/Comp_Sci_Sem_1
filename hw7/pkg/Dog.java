package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog{
	Random rand = new Random();
	String name;
	int age;
	String breed;
	public Dog(){
		name = ("Clifford");
		age = 3;
		breed = ("Big red dog");
	}
	public Dog(String name1){
		name = name1;
		age = 1;
		breed = ("dog dog");
	}
	public Dog(String name1, String breed1){
		name = name1;
		breed = breed1;
		age = 1;
	}
	public Dog(String name1, int age1){
		name = name1;
		age = age1;
		breed = ("dog dog");
	}
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String b){
		breed = b;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int rand_num1 = rand.nextInt(2);
		if (rand_num1 == 0){
			return false;
		}
		return true;
	}
	public void bark(){
		System.out.println(name + " is awake, and it barks");
	}
}