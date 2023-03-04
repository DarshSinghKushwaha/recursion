public class search_and_replace {
    public static void main(String[] args) {
        String str="xbxvxxxfcxxh";
        replace(str, 'x', 0,"");
    }
    public static void replace(String str,char ele,int i,String newstr) {
        if (i==str.length()) {
            System.out.println(newstr);
            return;
        }
        if (str.charAt(i)==ele ) {
            newstr+='a';
        }else{
            newstr+=str.charAt(i);
        }
        replace(str, ele,i+1,newstr);
    }
}