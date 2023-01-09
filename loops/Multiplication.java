import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number Of Table");
        x=input.nextInt();

        for (int i = 1; i <= 10; i++) {
            
            
            System.out.println(x+" X " +i+ "=" +x*i);

        }


    }
}