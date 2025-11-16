public class SelectionSort {
    public static void selectionSort(int [] arr){
        int size=arr.length;
        int smallestIndex;
        for(int i=0;i<size-1;i++){
            smallestIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[smallestIndex]){
                    smallestIndex=j;
                }
            }
            if(smallestIndex!=i){
                int temp=arr[i];
                arr[i]=arr[smallestIndex];
                arr[smallestIndex]=temp;
            }

        }
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"--->>>");
        }
    }
    public static void main(String[] args) {
        int [] arr={45,23,22,55,80,65,34,-6,86,90,778,778,95,0};
        selectionSort(arr);
        print(arr);
    }
}
