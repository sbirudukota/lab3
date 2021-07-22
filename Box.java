/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
 
*/
//Exercise #1
public class Box
{
int size = 0;
void printBox()
{
for(int i = 0; i < size; i++)
{
for(int j = 0; j < size; j++)
{
System.out.print("*");
}
System.out.println();
}
}
public static void main(String[] args)
{
Box b = new Box();
b.size = 5;
b.printBox();
}
}