import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=1;
        pattern(n,i);
        sc.close();
    }
    public static void pattern(int r,int i) {
        if(r==0){
            return;
        }
        print(r,i);
        System.out.println();
        pattern(r-1,i);
    }
    public static void print(int c,int i) {
        if(c==0){
            return;
        }
        System.out.print(i);
        i+=1;
        print(c-1,i);
    }
}
// program to print pattern
// 123
// 12
// 1