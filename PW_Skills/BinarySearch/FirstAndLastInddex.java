package PW_Skills.BinarySearch;

import java.util.Arrays;

public class FirstAndLastInddex {
    public static int [] firstAndLast(int [] arr,int ele){
        int fResult=-1;
        int lResult=arr.length;
        // finding first occurrence of element
        int low =0;
        int high=arr.length-1;
        int mid;
        while(low <= high){
            mid=low+(high-low)/2;
            if(arr[mid]==ele){
                fResult=mid;
                high=mid-1;
            }
            else if(arr[mid]>ele) high=mid-1;
            else low=mid+1;
        }
        // finding last occurrence of element
        low =0;
        high=arr.length-1;
        while(low <= high){
            mid=low+(high-low)/2;
            if(arr[mid]==ele){
                lResult=mid;
                low=mid+1;
            }
            else if(arr[mid]>ele) high=mid-1;
            else low=mid+1;
        }
        lResult=lResult==arr.length?-1:lResult;
        return new int[]{fResult,lResult};

    }

    public static void main(String[] args) {
        int [] arr={1,3,3,3,3,3,5,7,8};
        System.out.println(Arrays.toString(firstAndLast(arr,0)));
    }
}
