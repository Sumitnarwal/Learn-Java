import java.util.Scanner;

public class conditonStatments2 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        // int age =sc.nextInt();
        // if (age>18) {
        // System.out.println("Adult");

        // } else {
        // System.out.println("Not Adult");
        // }

        /////////////////////////////////////////////////////////////////////
        // int no = sc.nextInt();
        // if (no % 2 == 0) {
        // System.out.println("Even");

        // } else {
        // System.out.println("Odd");
        // }
        ////////////////////////////////////////////////////////////////////////
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a > b) {
        // System.out.println("a is greater");
        // } else if (b > a) {
        // System.out.println("B is greater");
        // } else {
        // System.out.println("A and B are equal");
        // }
        //////////////////// Switch Case////////////////////////////////////////

        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println(" 1 press");
                break;
            case 2:
                System.out.println("2 press");
                break;
            case 3:
                System.out.println("3 press");
                break;

            default:
                System.out.println("Invalid button");
        }
    }
}
