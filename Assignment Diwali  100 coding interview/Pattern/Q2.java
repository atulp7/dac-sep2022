
import java.util.Scanner;
public class Q2
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number of rows: ");

	int rows = sc.nextInt(); //Row input

	for (int i = rows; i >= 1; i--) {

	for (int j = i; j < rows; j++) {

	System.out.print(" "); //Print Spaces

}

	for (int k = 1; k <= (2 * i - 1); k++) {

	if (k == 1 || i == rows || k == (2 * i - 1)) { //logic to print Pattern

	System.out.print("*"); //Ture prints star

	}
	else 
	{

	System.out.print(" "); //False prints spaces

	}

	}

	System.out.println("");

	}

sc.close();

}

}

/*
*********
*     *
 *   *
  * *
   *

*/