package PW_Skills.BinarySearch;

// you have given an array of integers (sorted) so you have to find the lowest index of given element if exists
// neither lowest index of just greater element of that array and if all element in array is less than the given array then return last index;

import java.sql.PreparedStatement;

public class LowerBound {
    public static int lowerBound(int [] arr,int ele){
        int low=0;
        int high=arr.length-1;
        int result=arr.length;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]>=ele){
                result=mid;
                high=mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr={2, 4, 6, 8, 10};
        System.out.println(lowerBound(arr,9));
    }
}
