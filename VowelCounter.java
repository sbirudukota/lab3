/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
Exercise #3
*/
import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/* read one line of string */
		System.out.println("Please enter a strin to count number of vowels and nonvowels:");

		String word = sc.nextLine();
		int count_a,count_e,count_i,count_o,count_u;
		count_a=count_e=count_i=count_o=count_u=0;
		int consonant =0; 
		int str = word.length();
        int s=0;
        while(s<str)
        {
        	char c=word.charAt(s);
    		if (c=='a') count_a++;
    		else if (c=='e') count_e++;
    		else if (c=='i') count_i++;
    		else if (c=='o') count_o++;
    		else if (c=='u') count_u++;
    		else if (c!='A' && c!='E' && c!='I' && c!='O' && c!='U')
    			consonant ++;
    		s++;
        }
		/* display the values of the counters */
		System.out.println("vowel a count "+count_a);
		System.out.println("vowel e count "+count_e );
		System.out.println("vowel i count "+count_i);
		System.out.println("vowel o count "+count_o);
		System.out.println("vowel u count "+count_u);
		System.out.println("The non vowels count "+consonant);
		}

	}
