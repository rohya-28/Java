import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        int n,rem;

        System.out.println("Enter The Number");

        Scanner input = new Scanner(System.in);

        n=input.nextInt();

        while (n>0) {
            rem=n%10;
            n=n/10;

            System.out.println(rem);
        }
    


    }
}
