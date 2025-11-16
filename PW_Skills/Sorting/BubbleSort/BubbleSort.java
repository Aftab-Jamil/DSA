package PW_Skills.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int [] arr){
        int temp;
        for(int i=0; i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSortEnhanced(int [] arr){
        int temp;
        boolean isSorted=true;
        for(int i=0; i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted=false;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(isSorted) {
                System.out.println("break : it is already sorted");
                break;
            }

        }
    }

    public static void main(String[] args) {
        int [] arr={5,1,3,4,2};
        int [] arr2={1,2,5,6,7};
        System.out.println(Arrays.toString(arr));
        bubbleSortEnhanced(arr);
        System.out.println(Arrays.toString(arr));
    }
}
