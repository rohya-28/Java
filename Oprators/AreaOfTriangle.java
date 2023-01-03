import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[])
    {
        float base,height,area;

        System.out.println("Enter The Base And Height ");
        Scanner input = new Scanner(System.in);

        base=input.nextFloat();
        height=input.nextFloat();


        area=base*height/2;

        System.out.println("Area Of Triangle " +area);
    }
}
