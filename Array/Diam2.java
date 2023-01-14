// 2 diamentional array

public class Diam2 {
    public static void main(String[] args) {
      int A[][] ={{1,2,3},{1,2,3},{1,2,3}};
      int B[][] ={{1,2,3},{1,2,3},{1,2,3}};
      int C[][] = new int[3][3];

      for (int i = 0; i < A.length; i++) {
        
        for (int j = 0; j < B.length; j++) {

            C[i][j]=A[i][j]*B[i][j];            
        }
      }

      for (int x[] : C) {

        for (int y : x) {
            System.out.print(y+" ");
        }
        
      }
    }
}
