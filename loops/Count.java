import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int n, count=0;

        System.out.println("Enter The Number");

        Scanner input = new Scanner(System.in);

        n=input.nextInt();

        while (n>0) {
            n=n/10;
            count=count+1;
        }

        System.out.println(count);


    


    }
}
