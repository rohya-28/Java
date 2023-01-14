import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        System.out.println("Enter The Number Of Day");

        int number;

        try (Scanner input = new Scanner(System.in)) {
            number = input.nextInt();
        }

        switch (number) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Thu");
                break;    
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thus");
                break;    
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break; 
            case 7:
                System.out.println("Sun");
                break;       
            default:
                break;
        }
    }
}
