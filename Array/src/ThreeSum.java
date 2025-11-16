import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int [] arr,int target){
        int i,j,k;
        // sort array
        Arrays.sort(arr);
        List<List<Integer>> result=new ArrayList<>();
        for(i=0;i<arr.length-1;i++){
            // skip duplicates element for redundancy set of answer like [-1,0,1] at more than one time in the set
            if(i>0 && arr[i]==arr[i-1]) continue;
            j=i+1;
            k=arr.length-1;
            while(j<k){
                if((arr[i]+arr[j]+arr[k])==0){
                    result.add(new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k])));
                    // skip duplicates element from start
                    while(j<arr.length-1 && arr[j]==arr[j+1]) j++;
                    // skip duplicates element from end
                    while(k>i && arr[k]==arr[k-1]) k--;
                    j++;
                    k--;
                } else if ((arr[i]+arr[j]+arr[k])<0) {
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int [] arr={-1,0,1,2,-1,-4};
        //-4,-1,-1,0,1,2
        System.out.println(threeSum(arr,0));
    }
}
