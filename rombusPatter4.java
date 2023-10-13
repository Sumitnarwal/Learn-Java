import java.util.Scanner;

public class rombusPatter4 {

    public static void main(String arg[]) {
        // ----****
        // ---****
        // --****
        // -****
        // ****
        int n = 5;

        for (int i = 1; i <= n; i++) {
            String str = "";

            for (int j = n - i; j >= 1; j--) {
                //spaces
                str += "-";
            }
            for (int j = 1; j < n; j++) {
                str += "*";
            }

            System.out.println(str);
        }
    }
}
