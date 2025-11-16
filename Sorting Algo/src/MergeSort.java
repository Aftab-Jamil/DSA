public class MergeSort {
    public static void merge(int [] arr,int [] temp,int lowerIndex,int mid,int higherIndex){

        int current=lowerIndex;  // initial index of temp array from where the merged element will store temporary
        int i=lowerIndex,j=mid+1;
        while(i<=mid && j<=higherIndex){
            if(arr[i]<arr[j]){
                temp[current]=arr[i];
                i++;
            }else{
                temp[current]=arr[j];
                j++;
            }
            current++;
        }
        if(i>mid){
            while(j<=higherIndex){
                temp[current]=arr[j];
                j++;
                current++;
            }
        }else{
            while(i<=mid){
                temp[current]=arr[i];
                i++;
                current++;
            }
        }
        for(int k=lowerIndex;k<=higherIndex;k++){
            arr[k]=temp[k];
        }

    }
    public static void mergeSort(int [] arr,int [] temp,int lowerIndex,int higherIndex){

        if(lowerIndex<higherIndex){
            int mid=(lowerIndex+higherIndex)/2;
            mergeSort(arr,temp,lowerIndex,mid);
            mergeSort(arr,temp,mid+1,higherIndex);
            merge(arr,temp,lowerIndex,mid,higherIndex);


        }
    }
    public static void mergeSort(int [] arr){
        int [] temp=new int[arr.length]; // temp array
        mergeSort(arr,temp,0,arr.length-1);
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"--->>>");
        }
    }
    public static void main(String[] args) {
        int [] arr={9,5,2,4,3,56,34,26,86,90,-43,70,0};
        mergeSort(arr);
        print(arr);
    }
}
