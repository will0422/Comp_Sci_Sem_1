package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public myCharacter(){
		role = ("No Role");
	}
	public myCharacter(String role){
		if ((role.equals("wizard")) || (role.equals("Wizard"))){
			role = ("Wizard");
		}
		else if ((role.equals("warrior") || (role.equals("Warrior")))){
			role = ("Warrior");
		}
		else if ((role.equals("rogue") || (role.equals("Rogue")))){
			role = ("Rogue");
		}
		else{
			role = ("No Role");
		}
		System.out.println("Your role is " + role);
	}
}