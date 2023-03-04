
// PROGRAM TO PRINT FACTORIAL OF A NO.
import java.util.Scanner;

public class faact {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
        sc.close();
    }

    public static int fact(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * fact(num - 1);
    }
}
