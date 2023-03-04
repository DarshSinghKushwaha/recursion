
// PROGRAM TO CALCULATE SUM OF DIGITS SMALLER THAN OR EQUAL TO A NUMBER
import java.util.Scanner;

public class sumof {
    public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
        sc.close();
    }

    public static int sum(int num) {
        if (num != 1) {
            // RECURSION CALL
            return num + sum(num - 1);
        } else
            // EXIT CONDITON
            return num;
    }
}