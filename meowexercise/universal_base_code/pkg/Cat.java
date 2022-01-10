package pkg;
import java.util.Scanner;
import java.util.Random;


public class Cat{
	public String name;
	public Cat(){
		name = "Garfield";
	}
	public Cat(String whisk){
		name = whisk;
	}
	public void meow(){
		System.out.println(name + " Meows *rawr*");
	}
}
