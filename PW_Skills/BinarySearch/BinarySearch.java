package PW_Skills.BinarySearch;

public class BinarySearch {
    public static int binarySearch(int [] arr,int ele){
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==ele) return mid;
            else if(arr[mid]>ele) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={1,5,7,8,23,33,64,76};
        System.out.println(binarySearch(arr,76));
    }
}
