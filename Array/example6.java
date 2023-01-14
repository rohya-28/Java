public class example6 {
    public static void main(String[] args) {
        
        int A[] = new int[10];
        A[0]=1;A[1]=2;A[2]=3;A[3]=4;A[4]=5;

        int n = 6;

        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
        }

        int x = 20;
        int index=2;

        for (int i = n; i > index; i--) {
            A[i]=A[i-1];
            A[index]=x;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(A[i]+" ");
        }


    }
}