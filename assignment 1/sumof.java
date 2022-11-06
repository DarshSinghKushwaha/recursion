import java.util.Scanner;

public class sumof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sum(num));
        sc.close();
    }
    public static int sum(int num) {
        if(num!=1){
            return num+sum(num-1);
        }
        else
            return num;
    }
}