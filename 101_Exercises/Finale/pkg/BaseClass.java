package pkg;
import java.util.Scanner;
import java.util.Random;


public class Hangman{
	private String guessingWord;	//The word trying to be guessed
	private int numTries;			//How many tries the user has

	

	public void generateWord(){
		guessingword = generateWord();
		numTries = 5;
	}
	
	public int guessCheck(String letter, int start){
		guessingword = generateWord();
		numTries = sc.nextInt();
	}
	public int guessFirst(String a, int x){
		a = letter;
		int c = 0;
		while (c <= guessingWord.length()){
			if (letter == guessingWord.subtring(c)){
				return a;
			}
			c++;
		}
	}
	public boolean checkWin(boolean [] arr){
		if (guess.equals(guessingWord)){
			return true;
		}
		else{
			return false;
		}
	}

}