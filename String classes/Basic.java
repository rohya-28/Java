
public class Basic {
   public static void main(String[] args) {
   
    // This String is Stored in pool 
    String str = "Java";
    System.out.println(str);

    /*------*/

    // This String is stored in Heap 
    String str1 = new String("Java Program");
    System.out.println(str1);

    /*----------*/

    char c[] = {'A', 'B','C'};
    String str2= new String(c);
    System.out.println(str2);

    /*-----------*/

    byte b[] = {65,66,67,68};
    String str3= new String(b,1,2);
    System.out.println(str3);


   }    
}
