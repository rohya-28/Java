import java.util.Scanner;

//Searching an element

public class example2 {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9};

        Scanner input = new Scanner(System.in);

        int key=input.nextInt();

        for (int i = 0; i < A.length; i++) {
            if (A[i]==key) {
                System.out.println("Number was found in  "+i+ " This place");
                System.exit(0);//This terminate the entire program
            }
            System.out.println(A[i]);
        }
        System.out.println("Number was not found");
    }
}
