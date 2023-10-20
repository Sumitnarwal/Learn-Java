import java.util.*;

public class twoDarray11 {
    public static void main(String args[]) {

      //  int array[][] = new int[3][4];

        // String name = "Sumit";
        // String fullName = "Sumit@narwal";
        // String secName = "Sumit";

        // print string character
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // compare

        // String str1 = "Sumit";
        // String str2 = "Sumit!";
        // s1 > s2 : + ve value
        // s1 == s2 : 0
        // s1 < s2 : - ve value
        // if (str1.compareTo(str2) == 0) {
        // System.out.println("Str1 and str2 are equal");
        // } else {
        // System.out.println("Str1 and str2 are not equal");
        // }
        /////////////////////////
        // String sentence = "My name is Sumit Narwal.";

        // String name = str2.substring(4);

        // System.out.println(name);

        ////////////////////
        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);
        // char at index 0

        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0 ,'M');
        //insert at specific index 
        sb.insert(0, 'S' );


        //delete
        sb.delete(0, 1);
        System.out.println(sb);
    }
}
