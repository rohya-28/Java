public class arraypractice {
    public static void main(String args[])
    {
        int A[] = new int[10];

        int B[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(B);

        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }

        for(int x:B) {
            System.out.println(x);
        }
    }
}