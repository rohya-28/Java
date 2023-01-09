import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int x ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number");
        x=input.nextInt();

        int sum = 0;

        for (int i = 1; i <= x; i++) {
            sum =sum+i;
        }

        System.out.println("Sum of Number is " +sum);
    }
}
