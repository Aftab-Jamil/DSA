import java.util.HashMap;

public class TwoSum {
    public static int [] twoSum(int [] arr,int target){
        HashMap<Integer,Integer> hashMap=new HashMap<>();  // we will store ArrayValue as key and ArrayIndex as value
        int difference;
        int [] result=new int[2];
        for(int i=0;i<arr.length;i++){

            difference=target-arr[i];
            if(hashMap.containsKey(difference)){
                result[0]=hashMap.get(difference);
                result[1]=i;
                break;
            }else{
                hashMap.put(arr[i],i);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int [] arr={2,7,11,15};
        int [] result=twoSum(arr,17);
        System.out.println(result[0]+" : "+result[1]);

    }
}
