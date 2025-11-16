package PW_Skills.Sorting;

public class Missing_1_to_N {
    public static int missingNumber(int[] nums) {
        int biggestNumber=nums.length;
        int sum=(biggestNumber*(biggestNumber+1))/2;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int [] nums={3,0,1};
        System.out.println(missingNumber(nums));

    }
}
