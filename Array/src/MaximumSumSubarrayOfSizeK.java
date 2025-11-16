import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MaximumSumSubarrayOfSizeK {
//    public static int[] getFirstDistictElementWindow(int [] nums,int index,int k){
//        Set<Integer> distEleCurrentSubA=new HashSet<>();
//        int [] result=new int[2];
//        int sum=0;
//        for(int i=index;i<nums.length-k+1;i++){
//            int j=0;
//            while(j<k){
//                if(distEleCurrentSubA.contains(nums[j+i])){
//                    distEleCurrentSubA.clear();
//                    sum=0;
//                    i=j+i-1;
//                    break;
//                }else{
//                    sum+=nums[i+j];
//                    distEleCurrentSubA.add(nums[i+j]);
//                    j++;
//                }
//            }
//            if(j==k){
//                result[0]=i;
//                result[1]=sum;
//                return result;
//            }
//        }
//        result[0]=-1;
//        result[1]=sum;
//        return result;
//    }
    public static long maxSumSubArrayOfSizeK(int [] nums,int k){
        HashMap<Integer, Integer> map=new HashMap<>();
        long sum=0;
        long maxSum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(i>=k-1){
                if(map.size()==k) maxSum=Math.max(sum,maxSum);
                sum-=nums[i-k+1];
                map.put(nums[i-k+1],map.get(nums[i-k+1])-1);
                if(map.get(nums[i-k+1])==0) map.remove(nums[i-k+1]);
            }

        }
        return maxSum;

    }
    public static void main(String[] args) {
        int [] arr={1,1,4,2,9,9,9};
        System.out.println(maxSumSubArrayOfSizeK(arr,3));

    }
}
