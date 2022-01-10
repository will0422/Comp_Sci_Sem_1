package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public String role;
	public int strgth = 0;
	public int dext = 0;
	public int intel = 0;
	public int cons = 0;
	public int chari = 0;
	public myCharacter(){
		role = ("No Role");
	}
	public myCharacter(String a){
		if ((a.equals("wizard")) || (a.equals("Wizard"))){
			role = ("Wizard");
		}
		else if ((a.equals("warrior") || (a.equals("Warrior")))){
			role = ("Warrior");
		}
		else if ((a.equals("rogue") || (a.equals("Rogue")))){
			role = ("Rogue");
		}
		else{
			role = ("No Role");
		}
	}
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Strength = " + strgth);
		System.out.println("Dexterity = " + dext);
		System.out.println("Intelligence = " + intel);
		System.out.println("Constitution = " + cons);
		System.out.println("Charisma = " + chari);
	}
}