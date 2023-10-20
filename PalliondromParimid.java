public class PalliondromParimid {
    public static void main(String arg[]) {
        // - - - - 1
        // - - - 2 1 2
        // - - 3 2 1 2 3
        // - 4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // you can take a string variable also and store value in it and then print the
            // whole string
            //spaces
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            //first half left
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "");
            }
            //2nd  half right
            for (int j = 2; j <= i; j++) {
                System.out.print(j + "");
            }

            System.out.println();
        }
    }
}
