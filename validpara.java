import java.util.Stack;

public class validpara {
    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for (int i = 0;i < s.length(); i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[')
            {
                stk.push(s.charAt(i));
                 System.out.println(stk);
                 continue;
            }
            if (stk.empty()) {
                return false;
            }
                if(s.charAt(i)=='}' && stk.peek()=='{')
                {
                    stk.pop();
                     System.out.println(stk);
                }
                else if(s.charAt(i)==']' && stk.peek()=='[')
                {
                    stk.pop();
                     System.out.println(stk);
                    }
                else if(s.charAt(i)==')' && stk.peek()=='(')
                {
                    stk.pop();
                     System.out.println(stk);
                }else
                return false;
        }
        boolean result=stk.empty();
        return result;
    }
}
