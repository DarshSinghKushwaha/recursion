import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pw=sc.nextInt();
        System.out.println(pow(num,pw));
        sc.close();
    }
    static int pow(int num,int pw){
        if(pw==1){
            return num;
        }
            return num*pow(num,pw-1);
    }
}