package PW_Skills.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedElement {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    // way1 : less beat
        // Set<Integer> set =new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!set.contains(nums[i])) set.add(nums[i]);
        // }
        // List<Integer> list=new ArrayList<Integer>();
        // for(int i=1;i<=nums.length;i++){
        //     if(!set.contains(i)) list.add(i);
        // }
        // return list;
    // way 2: high beat
        int temp,i=0;
        List<Integer> result=new ArrayList<>();
        while(i<nums.length){
            if((nums[i]==i+1) || (nums[nums[i]-1]==nums[i])) i++;
            else{
                temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) result.add(j+1);
        }
        return result;


    }

    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
