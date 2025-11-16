package PW_Skills.BinarySearch;
// for detail discription you can visit to leetcode 162
//A peak element is an element that is strictly greater than its neighbors.
//Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
//You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
//You must write an algorithm that runs in O(log n) time.
public class PeakElement {
    public static int peakElement(int [] arr){
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if((mid==0 || arr[mid-1]<arr[mid]) && (mid==arr.length-1 || arr[mid+1]<arr[mid])) return mid;
            else if(arr[mid]<arr[mid+1]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(peakElement(arr));
    }
}
