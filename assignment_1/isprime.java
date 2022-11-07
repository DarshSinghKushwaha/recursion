import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(prime(num,2)){
            System.out.println("no. is prime");
        }
        else{
            System.out.println("no.is not prime");
        }
        sc.close();
    }
    public static boolean prime(int num,int i) {
        if(num>i){
            if (num%i==0) {
                return false;
            }
            else if(i==2){
                i+=1;
                }
                else{
                    i+=2;
                }
                return(prime(num,i));
        }
        return true;
    }
}
