package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public String role;
	public int strgth = 4;
	public int dext = 5;
	public int intel = 5;
	public int cons = 2;
	public int chari = 3;
	public myCharacter(){
		role = ("No Role");
		System.out.println(role);
	}
	public myCharacter(String a){
		role = a;
	}
	public String setRole(String a){
		boolean wiz = role.equals("wizard");
		boolean wiz1 = role.equals("Wizard");
		boolean war = role.equals("warrior");
		boolean war1 = role.equals("Warrior");
		boolean rog = role.equals("rogue");
		boolean rog1 = role.equals("Rogue");
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
			role = ("no role");
		}
		return role;
	}
	public int setStrength(int x){
		strgth = x;
		return strgth;
	}
	public int setDexterity(int x){
		dext = x;
		return dext;
	}
	public int setIntelligence(int x){
		intel = x;
		return intel;
	}
	public int setConstitution(int x){
		cons = x;
		return cons;
	}
	public int setCharisma(int x){
		chari = x;
		return chari;
	}
	public boolean setAll(String a, int b, int c, int d, int e, int f){
		role = a;
		strgth = b;
		dext = c;
		intel = d;
		cons = e;
		chari = f;
		return true;
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