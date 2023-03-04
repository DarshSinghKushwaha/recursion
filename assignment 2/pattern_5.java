import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=1;
        pattern(n,i);
        sc.close();
    }
    // PRINTS ROWS IN DECREASING ORDER
    public static void pattern(int r,int i) {
        // BASE CONDITION
        if(r==0){
            return;
        }
        print(r,i);
        System.out.println();
        // RECURSIVE CALL
        pattern(r-1,i);
    }
    // PRINTS NO. IN ROWS
    public static void print(int c,int i) {
        // BASE CONDITION
        if(c==0){
            return;
        }
        System.out.print(i);
        i+=1;
        // RECURSIVE CALL
        print(c-1,i);
    }
}
// program to print pattern
// 123
// 12
// 1