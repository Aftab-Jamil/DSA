import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverse(String str){
        Stack<Character> stack=new Stack<>();
        char [] chars=str.toCharArray();
        for (char c:chars){
            stack.push(c);
        }
        StringBuilder result= new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();

    }
    public static void main(String[] args) {

        String str="hello world";
        System.out.println(reverse(str));

    }
}
