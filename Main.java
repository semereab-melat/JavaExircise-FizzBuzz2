

import java.util.Scanner;

/***************************************************************
 Filename: FizzBuzz2
 Created by: Melat Semereab
 Created on: 10/9/2021
 Comment:  This program reads in 2 integers from the keyboard representing a start number and a finish number and outputs FIZZ, BUZZ,
 FIZZ BUZZ or the number for all numbers from start to finish (inclusive) according to the following
 ***************************************************************/

class Main 

{
  public static void main(String[] args) 
  
  {
        
      //declarinf our final variables
      final int NUMBER3 = 3;
      final int NUMBER7 = 7;
      //prompt the numbers from end user
      Scanner keyboard = new Scanner(System.in);

      //decalaring our variables
      int smallerNumber, greaterNumber, count;
      
      // creaaating a keyboard object to read data from the keyboard
      System.out.println("Enter smaller and bigger number respectively: ");
      smallerNumber = keyboard.nextInt();
      greaterNumber =keyboard.nextInt();

      // using for loop and if statement to get the values
      for (count = smallerNumber; count <= greaterNumber; count++)
      {
         if (count % NUMBER3 == 0 && count % NUMBER7 == 0)
            System.out.println("FIZZ BUZZ");

         else if (count % NUMBER3 == 0)
            System.out.println("FIZZ");

            else if (count % NUMBER7 == 0)
            System.out.println("BUZZ");
            
         else
         System.out.println(count);
      }//for
   }//main
}//class
    