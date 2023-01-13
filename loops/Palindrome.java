import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        
        System.out.println("Enter The Number");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int m = num;

        int rem=0, r;

        while (num>0) {
            r=num%10;
            rem=rem*10+r;
            num=num/10;
        }

        if (rem==m) {
            System.out.println("Its a Palindrome Number");
        } else {
            System.out.println("Its not a palindrome Number");
        }

        


    }
}