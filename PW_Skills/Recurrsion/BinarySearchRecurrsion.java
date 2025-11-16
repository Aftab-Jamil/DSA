package PW_Skills.Recurrsion;

public class BinarySearchRecurrsion {
    public static int binarySearchUsingRecurrsion(int [] arr,int low,int high,int search){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==search) return mid;
        else if(arr[mid]>search) return binarySearchUsingRecurrsion(arr,low,mid-1,search);
        else return  binarySearchUsingRecurrsion(arr,mid+1,high,search);
    }
    public static int binarySearchUsingRecurrsion(int [] arr,int search){
        return binarySearchUsingRecurrsion(arr,0,arr.length-1,search);
    }

    public static void main(String[] args) {
        int [] arr={1,5,7,8,23,33,64,76};
        System.out.println(binarySearchUsingRecurrsion(arr,76));
    }

}
