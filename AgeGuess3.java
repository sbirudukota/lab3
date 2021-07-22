/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
Exercise #1
*/

import java.util.Random;
import java.util.Scanner;

public class AgeGuess3 {
	public static void main(String[] args) {
		 Scanner var = new Scanner(System.in);
			Random rand = new Random();
			int age = rand.nextInt(10);
			int ageGuess;
			System.out.println("Enter your Guess :"); 
			ageGuess = var.nextInt();
			
			while ( age != ageGuess) 
			{
			    System.out.println("keep guessing..");
			    ageGuess = var.nextInt();

			}
			if(ageGuess == age)
			{
				System.out.println("Right guess");
			}

	}

}
