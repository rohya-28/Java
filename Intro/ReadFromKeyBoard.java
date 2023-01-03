import java.util.Scanner;

public class ReadFromKeyBoard {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int x,y;

        System.out.println("Enter a Two Numbers");

        x = input.nextInt();
        y = input.nextInt();

        int c = x + y;

        System.out.println(c);
    }
}
