public class InsertionSort {
    public static void insertionSort(int [] arr){
        int size=arr.length;
        for(int i=1;i<size;i++){
//            for(int j=i-1;j>=0;j--){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
            // Above implementation is also correct
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"--->>>");
        }
    }
    public static void main(String[] args) {
        int [] arr={45,23,22,55,80,65,34,86,90,778,778,95,0};
        insertionSort(arr);
        print(arr);
    }
}
