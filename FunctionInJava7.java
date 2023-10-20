import java.util.*;

public class FunctionInJava7 {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        findGreatestOne(a,b);

    }

   public static void findGreatestOne(int a,int b){

    if(a>b){
        System.out.println("a is greater");
    }else{
        System.out.println("b is greater");

    }
   }
}


