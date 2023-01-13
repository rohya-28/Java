import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        
        System.out.println("Enter The Number");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int rem=0, r;

        while (num>0) {
            r=num%10;
            rem=rem*10+r;
            num=num/10;
        }

        System.out.println("Here is Your Rev Number " +rem);


    }
}