/*
Program: Java program to print a pattern 		
   *		
  * *		
 * * *		
* * * *	
@code by:Krushikesh
date:15 sep 2022
*/
import java.io.*;
 
// creating a class star pattern
 class StarPattern 
{
    // creating a method print trangle
     static void printPattern(int n)
    {
        // outer loop 
        for (int i=0; i<n; i++)
        {
 
            // inner loop 
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
  
            //  inner loop 
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
  
            
            System.out.println();
        }
    }
     
    // calling main method
    public static void main(String... args)
    {
        int number=Integer.parseInt(args[0]);
        printPattern(number);// calling print trangle
    }
}