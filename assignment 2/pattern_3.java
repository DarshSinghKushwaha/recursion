import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        npattern(n,1);
        sc.close();
    }
    public static void npattern(int r,int i) {
        // BASE CONDITION
        if(r==0){
            return;
        }
        printspaces(i);
        print(r);
        System.out.println();
        // RECURSIVE CALL
        npattern(r-1,i+1);
    }
    public static void printspaces(int c) {
        // BASE CONDITION
        if(c==0){
            return;
        }
        System.out.print("  ");
        // RECURSIVE CALL
        printspaces(c-1);
    }
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
//   * *
//     *