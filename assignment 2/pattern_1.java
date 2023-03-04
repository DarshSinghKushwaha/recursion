import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        sc.close();
    }
    // PRINTS ROWS IN DECREASING ORDER
    public static void pattern(int r) {
        // BASE CONDITION
        if(r==0){
            return;
        }
        print(r);
        System.out.println();
        // RECURSIVE CALL
        pattern(r-1);
    }
    // PRINTS STRING OF '*'
    public static void print(int c) {
        // BASE CONDITION
        if(c==0){
            return;
        }
        System.out.print("* ");
        // RECURSIVE CALL
        print(c-1);
    }
}
// program to print pattern
// * * *
// * *
// *