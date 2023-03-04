
// PROGRAM TO CALCULATE POWER OF A NO.
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pw = sc.nextInt();
        System.out.println(pow(num, pw));
        sc.close();
    }

    static int pow(int num, int pw) {
        // BASE CONDITION
        if (pw == 1) {
            return num;
        }
        // RECURSION CALL
        return num * pow(num, pw - 1);
    }
}