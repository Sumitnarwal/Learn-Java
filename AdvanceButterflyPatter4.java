public class AdvanceButterflyPatter4 {

    public static void main(String arg[]) {
        //butter fly pattern "-" is represent space
        // *--------*
        // **------**
        // ***----***
        // ****--****
        // **********
        // **********
        // ****--****
        // ***----***
        // **------**
        // *--------*
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String row = "";
            //uper-left-half
            for (int j = 1; j <= i; j++) {
                // row += "*";
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                // row += " ";
                System.out.print(" ");
            }
            //uper-right-half
            for (int j = 1; j <= i; j++) {
                // row += "*";
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            String row = "";
            //lower-left-half
            for (int j = 1; j <= i; j++) {
                // row += "*";
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                // row += " ";
                System.out.print(" ");
            }
             //lower-right-half
            for (int j = 1; j <= i; j++) {
                // row += "*";
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
