import java.util.Scanner;
import java.util.Random;

class Character{
	static String wiz;
	static int strgth;
	static int dext;
	static int intel;
	static int cons;
	static int chari;
	public Character(String roles, int stat1, int stat2, int stat3, int stat4, int stat5){
		wiz = roles;
		strgth = stat1;
		dext = stat2;
		intel = stat3;
		cons = stat4;
		chari = stat5;
		
	}
	public String toString(){
		System.out.println(strgth + " points to strength " + dext + " points to dexterity " + intel + " points to intelligence " + cons + " points to constitution" + chari + " points to charisma");
		return wiz;
	}
}
class starter {
	public static void main(String args[]) {
		Character wiz = new Character("Wizard", 5, 4, 3, 2, 1);
		System.out.println(wiz);
		

		
	}
}
