import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static int [] NextGreaterElement(int []  nums){
        int [] nextGreaterArray=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                stack.pop();
            }
            nextGreaterArray[i]=stack.isEmpty()?nums.length:stack.peek();
            stack.push(i);
        }
        System.out.println(Arrays.toString(nextGreaterArray));
        return nextGreaterArray;
    }
    public static int [] sildingWindowMaximum(int [] nums,int k){
        //solution 1:  this is solved by me but this took time complexity O(N.K). which is not acceptable by leetcode(Time Limit exceeds)
//        int [] maximum=new int[nums.length-k+1];
//        int max=nums[0];
//        int j=1;
//        while(j<k){
//            max=Math.max(nums[j],max);
//            j++;
//        }
//        maximum[0]=max;
//        for(int i=1;i<maximum.length;i++){
//            if(max==nums[i-1]) {
//                max=nums[i] ;
//                j = 0;
//                while (j < k) {
//                    max = Math.max(max, nums[j+i]);
//                    j++;
//                }
//            }else{
//                max=Math.max(max,nums[i+k-1]);
//            }
//            maximum[i]=max;
//        }
//        return maximum;
        // Solution 2: its acceptable but can't much solution
//        int [] nxGtIn=NextGreaterElement(nums);
//        int [] maximum=new int[nums.length-k+1];
//        int max,j;
//        for(int i=0;i<maximum.length;i++){
//            max=i;
//            while(nxGtIn[max]<i+k){
//                max=nxGtIn[max];
//            }
//            maximum[i]=nums[max];
//        }
//        return  maximum;
        // Solution 3: it can beat most of solutions
        int [] maximum=new int[nums.length-k+1];
        Deque<Integer> deque=new ArrayDeque<>();
        int j=0;
        int i;
        for(i=0;i<k;i++){
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i])
                deque.removeLast();
            deque.addLast(i);
        }
        for(;i<nums.length;i++){
            maximum[j]=nums[deque.peekFirst()];
            j++;
            while(!deque.isEmpty() && deque.peekFirst()<=i-k)
                deque.removeFirst();
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i])
                deque.removeLast();
            deque.addLast(i);
        }
        maximum[j]=nums[deque.peekFirst()];
        return maximum;
    }
    public static void main(String[] args) {
        int [] arr={9,8,9,8};
        System.out.println(Arrays.toString(sildingWindowMaximum(arr,2)));

    }
}
