import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter The Number");
        
        Scanner input = new Scanner(System.in);

        n=input.nextInt();

        int fact = 1;
        
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }

        System.out.println("Factorial Of Number is " +fact);
    }
}
