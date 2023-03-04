public class revstr {
    public static void main(String[] args) {
        String str="abcd";
        reverse(str, str.length()-1);
    }
    public static void reverse(String s,int i) {
        if (i==0) {
            System.out.println(s.charAt(i));
            return;   
        }
        System.out.println(s.charAt(i));
        reverse(s, i-1);
    }
}
