// Program to format username or domain name

import java.util.Scanner;

public class Domain {
   public static void main(String args[])
   {

    String gmail;
    System.out.println("Enter The Gmail");

    Scanner input = new Scanner(System.in);

    gmail=input.nextLine();   
    
    int i = gmail.indexOf("@"); 

    String username = gmail.substring(0, i);
    String domain = gmail.substring(i+1, gmail.length());

    System.out.println("Here Is your User name " +username );
    System.out.println("Here Is your Domain " +domain );
   }
}