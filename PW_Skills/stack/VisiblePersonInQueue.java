package PW_Skills.stack;

import java.util.Arrays;
import java.util.Stack;
// Leetcode 1944
// using same concept as we used in nextGreaterElement

public class VisiblePersonInQueue {
    public static int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> stack =new Stack<>();
        int count=0;
        int [] res=new int [heights.length];
        for(int i=heights.length-1;i>=0;i--){
            count=0;
            while(!stack.isEmpty() && stack.peek()<heights[i]){
                count++;
                stack.pop();
            }
            if(!stack.isEmpty()) res[i]=count+1;
            else res[i]=count;
            stack.push(heights[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        int []  heights = {10,6,8,5,11,9};
        System.out.println(Arrays.toString(canSeePersonsCount(heights)));
    }
}
