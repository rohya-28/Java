import java.util.Scanner;

public class MyProgram {
    public static void main(String args[]) 
    {

        String name;

        System.out.println("Enter your name");
        
        Scanner sc= new Scanner(System.in);

        name = sc.nextLine();

        System.out.println("Hi " +name);
    }
}
