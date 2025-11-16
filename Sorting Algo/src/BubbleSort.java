public class BubbleSort {
    public static void bubbleSort(int [] arr){
        int size=arr.length;
        boolean isSwapped;  // this is used to reduce time complexity for a sorted array if array is sorted it will not take O(N^2) it will have time complexity is only O(N)
        for(int i=0;i<size-1;i++){
            isSwapped=false;
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false) break;
        }
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"--->>>");
        }
    }

    public static void main(String[] args) {
        int [] arr={45,23,22,55,80,65,34,86,90,778,778,95,0};
        int [] arr2={1,2,3,4,5};
//        bubbleSort(arr);
//        print(arr);
        bubbleSort(arr2);
        print(arr2);

    }
}
