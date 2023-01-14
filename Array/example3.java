//Finding Maximum Element

public class example3 {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9};

        int max,max2;
        max=max2=A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i]>max) {
                max2=max;
                max=A[i];
            }else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("Here is Max Number" +max);
        System.out.println("Here is Second Max Number" +max2);
    }
}
