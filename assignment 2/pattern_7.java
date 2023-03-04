import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        // takes input from user
        System.out.println("enter no.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        npattern(n,1,1);
        sc.close();
    }
    public static void npattern(int r,int i,int j) {
        // BASE CONDITION
        if(r==0){
            return;
        }
        printn(i,r,j);
        System.out.println();
        // RECURSIVE CALL
        npattern(r-1,i+1,j);
    }
    public static void printn(int c,int r,int j) {
        // BASE CONDITION
        if(c==0){
            return;
        }
        System.out.print(j++);
        // RECURSIVE CALL
        printn(c-1,r,j);
    }
}
// program to print pattern
// 1
// 12
// 123