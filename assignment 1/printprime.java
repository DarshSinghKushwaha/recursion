import java.util.Scanner;

public class printprime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for (int j = 1; j < num; j++) {
            if(prime(j,2)){
                System.out.println(j);
            }
        }
       scanner.close();
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
