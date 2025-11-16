package PW_Skills.Sorting.SelectionAndInsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int [] arr){
        int temp;
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int [] arr={5,1,3,4,2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
