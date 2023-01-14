// To check number is odd or even

import java.util.Scanner;

public class Number {
   public static void main(String args[])
   {
    int x;

    System.out.println("Enter The Number");
    
    try (Scanner input = new Scanner(System.in)) {
      x=input.nextInt();
    }

    if (x%2==0) {
      System.out.println("The Number is Even");
    } else {
      System.out.println("The Number is odd");
    }
   }
}