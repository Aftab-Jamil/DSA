package PW_Skills.Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMisMatch {
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int missing=-1,repeated=-1;
        int arraySum=0;
        for(int i=0;i<nums.length;i++){
            arraySum+=nums[i];
            if(set.contains(nums[i])){
                repeated=nums[i];
            }else set.add(nums[i]);
        }
        int sum=(nums.length)*(nums.length+1)/2;
        missing=repeated+sum-arraySum;
        int [] result={repeated,missing};
        return result;
    }

    public static void main(String[] args) {
        int [] arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

}
