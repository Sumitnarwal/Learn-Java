public class LoopsPaternQuestions3 {

    public static void main(String arg[]) {
        // for(initialisation;condtion;updation){}
        int n = 5;
        int m = 5;
        // for (int i = 0; i < n; i++) {
        // String ans = "";
        // for (int j = 0; j < m; j++) {
        // ans += "*" + " ";
        // }
        // System.out.println(ans);
        // }
        ///////////////////////////////////////

        // for (int i = 0; i < n; i++) {
        // String ans = "";
        // for (int j = i; j < m; j++) {
        // ans += "*" + " ";
        // }
        // System.out.println(ans);
        // }
        ////////////////////////////////////////////////////////
        // * * * * *
        // * - - - *
        // * - - - *
        // * - - - *
        // * * * * *
        // for (int i = 0; i < n; i++) {
        // String ans = "";
        // for (int j = 0; j < m; j++) {
        // if (j == 0 || j == m - 1 || i == 0 || i == n - 1) {

        // ans += "* ";
        // } else {
        // ans += " ";
        // }
        // }
        // System.out.println(ans);
        // }
        ///////////////////////////////////
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // for (int i = 0; i < n; i++) {
        // String ans = "";
        // for (int j = 0; j < m; j++) {
        // if (i >= j) {

        // ans += "* ";
        // } else {
        // ans += " ";
        // }
        // }
        // System.out.println(ans);
        // }

        ////////////////////////////////////////////////////////////
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // for (int i = 0; i < n; i++) {
        // String ans = "";
        // for (int j = 0; j < m; j++) {
        // if (i + j < m) {

        // ans += "* ";
        // } else {
        // ans += " ";
        // }
        // }
        // System.out.println(ans);
        // }
        //////////////////////////////////////////////////////////////////
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // for (int i = 1; i <= n; i++) {
        // String ans = "";
        // for (int j = 1; j <= m; j++) {
        // if (i >= j) {

        // ans += j + " ";
        // }
        // }
        // System.out.println(ans);
        // }
        /////////////////////////////////////////////////

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        // String ans = "";
        // for (int j = 1; j <= i; j++) {

        // ans += num + " ";
        // num++;

        // }
        // System.out.println(ans);
        // }
        ///////////////////////////////////////////////////////////////////////////////
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        for (int i = 1; i <= n; i++) {
            String ans = "";
            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    ans += "1 ";
                } else {
                    ans += "0 ";

                }
            }
            System.out.println(ans);
        }
    }
}
