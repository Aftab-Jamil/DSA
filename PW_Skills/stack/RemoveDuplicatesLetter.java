package PW_Skills.stack;

import java.util.Stack;
// leetcode 316 : using similar concept as we used in converting infix to postfix expression but with concern of visited and frequency
public class RemoveDuplicatesLetter {
    public static String removeDuplicateLetters(String s) {
        int [] frequency = new int [26];
        boolean [] visited = new boolean [26];
        Stack<Character> stack=new Stack<>();
        // calculate frequency of each character present in string
        for(char x:s.toCharArray()){
            frequency[x-'a']++;
        }
        // find the res in stack
        for(char x:s.toCharArray()){
            // if x is already visited then continue;
            if(visited[x-'a']){
                frequency[x-'a']--;
                continue;
            }
            // removing element from stack  util stack become empty and its peek element is greater or equal to present x and frequency of peek element is greater than 0
            while(!stack.isEmpty() && stack.peek()>=x && frequency[stack.peek()-'a']>0){
                visited[stack.peek()-'a']=false;
                stack.pop();
            }
            // push x in stack
            stack.push(x);
            visited[x-'a']=true;
            frequency[x-'a']--;
        }
        // converting stack result to string result

        StringBuilder res=new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();

    }
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("abdbbs"));
    }
}
