import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n,n);
        sc.close();
    }
    public static void pattern(int r,int c) {
        if(c<0){
            return;
        }
        print(c);
        System.out.println();
        pattern(r-1,r-1);
    }
    public static void print(int c) {
        if(c<0){
            return;
        }
        System.out.print("* ");
        print(c-1);
    }
}
