import java.util.Scanner;

public class printdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(pd(num));
        sc.close();
    }
    public static int pd(int num){
        if (num!=0) {
        System.out.print(num%10);
        return pd(num/10);
        }
        return num;
    }
}