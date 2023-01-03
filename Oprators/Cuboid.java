import java.util.Scanner;

public class Cuboid {
    public static void main(String args[])
    {
        int height, length, base;
        float area , volume;

        System.out.println("Enter The Height Length Base of Cuboid");
        Scanner input = new Scanner(System.in);

        height = input.nextInt();
        length = input.nextInt();
        base = input.nextInt();

        area=2*((length*base)+(base*height)+(length*height));
        volume=length*base*height;


        System.out.println("Volume Of Cuboid Is " +volume);
        System.out.println("Area Of Cuboid Is " +area);


    }
}
