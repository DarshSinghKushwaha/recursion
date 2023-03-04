
// PROGRAM TO CHECK IF A NO. IS PRIME OR NOT
import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (prime(num, 2)) {
            System.out.println("no. is prime");
        } else {
            System.out.println("no.is not prime");
        }
        sc.close();
    }

    public static boolean prime(int num, int i) {
        if (num > i) {
            // BASE CONDITION
            if (num % i == 0) {
                return false;
            } else if (i == 2) {
                // CHECKS FOR 3
                i += 1;
            }
            // CHECKS FOR EVERY OTHER ODD NO.
            else {
                i += 2;
            }
            // RECURSION CALL
            return (prime(num, i));
        }
        return true;
    }
}
