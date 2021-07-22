/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
Exercise #2
*/
import java.util.Scanner;

public class EvenNumSum_1 {

	/**4
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		int n;
		System.out.println("enter a value");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n < 2)
		{
		System.out.println("pleae enter value 2 or grater than 2");
		n = sc.nextInt();
		}
	    int sum = 0;
	    int even = 2;
        for(int i = 2; i <n; i ++) {
            sum += even;
            even += sum;
        } System.out.println("Sum of even numbers is " + sum);

	}

}
