import java.util.Scanner;

public class printprime {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // CHECKS FOR EVERY NO. IN LOOP
        for (int j = 1; j < num; j++) {
            if (prime(j, 2)) {
                System.out.println(j);
            }
        }
        scanner.close();
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
