import java.util.Scanner;

public class NinWords {
    public static void main(String[] args) {
        int num,rev;

        System.out.println("Enter The Number");

        Scanner input = new Scanner(System.in);

        num=input.nextInt();

        String str="";

        while (num>0) {
            rev=num%10;
            num=num/10;
            str=str+rev;
        }

        char c;
        for (int i = str.length()-1; i >= 0; i--) {
             c=str.charAt(i);
             switch (c) {
                case '0':
                    System.out.println("One");
                    break;
                case '1':
                    System.out.println("One");
                    break;    
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                    System.out.println("Three");
                    break;
                case '4':
                    System.out.println("Four");
                    break;  
                case '5':
                    System.out.println("Five");
                    break; 
                case '6':
                    System.out.println("Six");
                    break;    
                case '7':
                    System.out.println("Seven");
                    break;             
                 case '8':
                    System.out.println("Eight");
                    break;
                case '9':
                    System.out.println("Nine");
                    break;
                    default:
                    break;
             }
        }
    }
}
