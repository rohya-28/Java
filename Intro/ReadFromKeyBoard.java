import java.util.Scanner;

public class ReadFromKeyBoard {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int x,y;

        System.out.println("Enter a Two Numbers");

        x = sc.nextInt();
        y = sc.nextInt();

        int c = x + y;

        System.out.println("Here Is Sum Of Two Number");
        System.out.println(c);
    }
}
