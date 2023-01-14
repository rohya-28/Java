//Rotating to left array;

public class example4 {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};

        for (int i : A) {
            System.out.print(i+ " ");
        }

        int temp=A[0];
        for (int i = 1; i < A.length; i++) {
            A[i-1]=A[i];
        }
        
        A[A.length-1]=temp;

        for (int i : A) {
            System.out.print(i+ " ");
        }



    }
}
