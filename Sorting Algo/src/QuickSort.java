public class QuickSort {
//    public static int partition(int [] arr,int lowerIndex,int higherIndex){
//        int pivot=lowerIndex,temp;
//        int start=lowerIndex+1,end=higherIndex;
//        while(start<end){
//            while(start<=higherIndex && arr[start]<arr[pivot]){
//                start++;
//            }
//            while(end>lowerIndex && arr[end]>=arr[pivot]){
//                end--;
//            }
//            if(start<end){
//                temp=arr[start];
//                arr[start]=arr[end];
//                arr[end]=temp;
//            }
//        }
//        temp=arr[end];
//        arr[end]=arr[pivot];
//        arr[pivot]=temp;
//        return end;
//    }
    // this is the correct implementation of partition method whatever written in its_me_all_chat is wrong for some cases
    public static int partition(int [] arr,int low,int high){
         int i=low,j=low,temp;
         int pivot=arr[high];
        while (i <= high) {
            if(arr[i]<=pivot){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public static void quickSort(int [] arr,int lowerIndex,int higherIndex){
        if(lowerIndex<higherIndex){
            int parti=partition(arr,lowerIndex,higherIndex);
            quickSort(arr,lowerIndex,parti-1);
            quickSort(arr,parti+1,higherIndex);
        }
    }
    public static void quickSort(int [] arr){
        quickSort(arr,0,(arr.length-1));
    }
    public static void print(int [] arr){
        for (int i: arr){
            System.out.print(i+"---->>>>");
        }
    }
    public static void main(String[] args) {
        int [] arr={10,2,10,4,10,5};
        quickSort(arr);
        print(arr);
    }
}
