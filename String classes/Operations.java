// ALl STRING OPERATIONS

public class Operations {
    public static void main(String[] args) {

        //Main Base String
        String base = "JAVA PROGRAM";

        //LENGTH OF STRING
        System.out.println(base.length());

        //String to lowerCase
        //Strings are immutable means un-change-ble
        String str = base.toLowerCase();
        System.out.println(str==base);
        System.out.println(base.toLowerCase());

        //String to uppercase
        System.out.println(base.toUpperCase());

        // String Trim
        System.out.println(base.trim());

        //String Substring
        String str1 = base.substring(2, 4);
        System.out.println(str1);

        //String Replace
        String str2 = base.replace('J', 'P');
        System.out.println(str2);

        //String startWith
        System.out.println(base.startsWith("J"));

        //String endWith
        System.out.println(base.endsWith("J"));

        //String charAt
        System.out.println(base.charAt(2));

        //String indexOF
        System.err.println(base.indexOf("A"));

        //String lastIndex
        System.out.println(base.lastIndexOf("A"));

        /*-------------- ---------- ----------------*/

        String Str = "java";
        String Str1 = "JAVA";
        String Str2 = "JAVA DataTypes";
        String Str3 = "JAVA Operators";

        // Check The str equal to str2
        boolean val = str.equals(Str2);
        System.out.println(val);

        // Ignore the all cases and check the string
        boolean val1 = Str.equalsIgnoreCase(Str1);
        System.out.println(val1);

        //String Compare
        int val2 = str.compareTo(Str3);
        System.out.println(val2);

        //String contains
        System.out.println(Str.contains("A"));



    }
}
