package PW_Skills.Sorting;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        // this can be solved same as we have find the starting node in cycle singly linkedlist (highest beat and not modify array as mentioned)
        int slow=0;
        int fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=0;
        while(fast!=slow){
            fast=nums[fast];
            slow=nums[slow];
        }
        return slow;
// way 2: (low beat and modify array which is not reccomended) : we store element at element-1 index in array
        // int i=0;
        // int temp;
        // while(i<nums.length){
        //     if(nums[i]==i+1 || nums[nums[i]-1]==nums[i]) i++;
        //     else{
        //         temp=nums[nums[i]-1];
        //         nums[nums[i]-1]=nums[i];
        //         nums[i]=temp;
        //     }
        // }
        // for(int j=0;j<nums.length;j++){
        //     if(nums[j]!=j+1) return nums[j];
        // }
        // return -1;


    }

    public static void main(String[] args) {
        int [] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
