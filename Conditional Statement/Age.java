import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int Age;

        System.out.println("Enter Your Age");

        Scanner input = new Scanner(System.in);

        Age=input.nextInt();

        if (Age >= 14 && Age <=55) {
            System.out.println("You are Young");
        } else {
            System.out.println("You are Teen");
        }
    }
}