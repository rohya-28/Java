//Rotating to right an array

public class example5 {
  public static void main(String[] args) {
   int A[] = {1,2,3,4,5};

   for (int i : A) {
    System.out.print(i+ " ");    
   }

   int temp=A[A.length-1];
    for (int i = 1; i < A.length-1; i++) {
       A[i+1]=A[i];
    }

   A[0]=temp; 
   
   for (int i : A) {
    System.out.print(i+ " ");    
   }
  }    
}
