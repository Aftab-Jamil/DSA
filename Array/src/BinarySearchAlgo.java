public class BinarySearchAlgo {
//    // using recursion
//    public static int binarySearch(int [] arr,int value){
//        return binarySearch(arr,0,arr.length-1,value);
//    }
//    public static int binarySearch(int [] arr,int lowerIndex,int higherIndex,int value){
//        if(lowerIndex>higherIndex){
//            return -1;
//        }
//        int mid=(lowerIndex+higherIndex)/2;
//        if(arr[mid]==value){
//            return mid;
//        }
//       else if(arr[mid]>value){
//            return binarySearch(arr,lowerIndex,mid-1,value);
//        }
//       else{
//            return binarySearch(arr,mid+1,higherIndex,value);
//        }
//    }
    // using iterative method
    public static int binarySearch(int [] arr,int value){
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
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={3,5,7,10,24,39,58,60,90,200,205,206};
        int ind=binarySearch(arr,2060);
        System.out.println(ind);

    }
}
