import java.util.Scanner;

public class AOT2 {
    public static void main(String args[])
    {
        float a,b,c,s;

        System.out.println("Enter The value of Triangle A , B ,C");
        Scanner input = new Scanner(System.in);

        a=input.nextFloat();
        b=input.nextFloat();
        c=input.nextFloat();

        s=(a+b+c)/2f;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        
        System.out.println("Area of triangle " +area);




    }
}
