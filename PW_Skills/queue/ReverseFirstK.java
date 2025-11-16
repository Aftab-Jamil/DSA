package PW_Skills.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {
    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k){
        if(k<0 || k>queue.size()){
            throw new IllegalArgumentException("k should greater than -1 and less than "+ queue.size());
        }
        Stack<Integer> stack= new Stack<>();
        Queue<Integer> output=new LinkedList<>();
        while(k!=0){
            stack.push(queue.remove());
            k--;
        }
        while(!stack.isEmpty()) output.add(stack.pop());
        while(!queue.isEmpty()) output.add(queue.remove());
        return output;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(reverseFirstK(q,9));

    }
}
