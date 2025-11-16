// Problem statement
// Given a soered array of distinct integers and a target value,return the index if the target is found.
// if not , return the index where it would be inserted in order so that time complexity will be log(n)


public class SearchNietherInsertPosition {
    public static int findSearchNietherInsertingPosition(int [] arr,int value){
//        // if value is less than or equal to smallest element in the array
//        if(arr[0]>=value){
//            return 0;
//        }
        int lowerIndex=0,higherIndex=arr.length-1,mid;
        while(lowerIndex<=higherIndex){
            mid=(lowerIndex+higherIndex)/2;
            if(arr[mid]==value){
                return mid;
            } else if (arr[mid]>value) {
                higherIndex=mid-1;
            }else{
                lowerIndex=mid+1;
            }
        }
        return lowerIndex;
    }
    public static void main(String[] args) {
        int [] arr={3,5,7,10,24,39,58,60,90,200,205,206};
        int ind=findSearchNietherInsertingPosition(arr,30);
        System.out.println(ind);
    }
}
