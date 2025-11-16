package PW_Skills.Sorting.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int [] arr,int lowIndex,int highIndex){
        int pivot=lowIndex;
        int i=lowIndex+1;
        int j=highIndex;
        int temp;
        while(i<=j){
            while(i<=highIndex && arr[i]<=arr[pivot]){
                i++;
            }
            while(j>=lowIndex && arr[j]>arr[pivot]){
                j--;
            }
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[j];
        arr[j]=arr[pivot];
        arr[pivot]=temp;
        return j;
    }
    public static void quickSort(int [ ] arr, int low, int high){
        if(low<high){
            int loc=partition(arr,low,high);
            quickSort(arr,low,loc-1);
            quickSort(arr,loc+1,high);
        }
    }
    public static void quickSort(int [ ] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int [] arr={5,1,3,4,2};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
