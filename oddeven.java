
// PROGRAM TO CALCULATE SUM OF ALL ODD AND EVEN DIGITS IN A NUMBER
import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), odd = 0, even = 0;
        show(num, odd, even);
        sc.close();
    }

    public static void show(int num, int odd, int even) {
        // EXIT CONDITION
        if (num == 0) {
            System.out.println("odd " + odd);
            System.out.println("even " + even);
            return;
        }
        int d = num % 10;
        // IF DIGIT IS ODD , ADD TO SUM OF ODD
        if (d % 2 != 0) {
            odd += (d);
        }
        // IF DIGIT IS EVEN , ADD TO SUM OF EVEN
        if (d % 2 == 0) {
            even += (d);
        }
        // RECURSIVE CALL
        show(num / 10, odd, even);
    }
}
