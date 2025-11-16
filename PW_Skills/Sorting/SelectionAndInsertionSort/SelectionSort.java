package PW_Skills.Sorting.SelectionAndInsertionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int [] arr){
        int smallIndex,temp;
        for(int i=0;i<arr.length-1;i++){
            smallIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[smallIndex]) smallIndex=j;
            }
            if(smallIndex!=i){
                temp=arr[i];
                arr[i]=arr[smallIndex];
                arr[smallIndex]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={5,1,3,4,2};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
