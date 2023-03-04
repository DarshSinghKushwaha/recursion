public class findoccur {
    public static void main(String[] args) {
        String str="abaaahaaacghah";
        find(str, 'a', 0);
    }
    public static int first=-1;
    public static int last=-1;
    public static void find(String str,char ele,int i) {
        if (i==str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr=str.charAt(i);
        if (curr==ele ) {
            if (first==-1) {
                first=i;
            } else {
                last=i;
            } 
        }
        find(str, ele,i+1);
    }
}
