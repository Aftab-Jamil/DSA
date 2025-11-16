import java.util.Stack;

public class IsBalancedParanthesis {
    public static boolean isBalanced(String str){
        char [] chars=str.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:chars){
            if(c=='(' || c=='{' || c=='[') {
                stack.push(c);
            }else {
                if(stack.isEmpty())
                    return false;
               else{
                   char ch=stack.peek();
                   if((ch=='(' && c==')')
                   || (ch=='{' && c=='}')
                   || (ch=='[' && c==']')){
                       stack.pop();
                   }else{
                       return false;
                   }
                }
            }
        }
        return  stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isBalanced("[({()()})]"));

    }
}
