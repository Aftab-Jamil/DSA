package PW_Skills.Sorting.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int [] arr,int low,int mid,int high){
        int i=low,j=mid+1,k=low;
        int [] temp=new int[arr.length];
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(j<=high){
            temp[k]=arr[j];
            j++;
            k++;
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        for(int m=low;m<=high;m++){
            arr[m]=temp[m];
        }

    }
    public static void mergeSort(int [] arr,int low, int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }
    public static void mergeSort(int [] arr){
        mergeSort(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int [] arr={5,1,3,4,2};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
