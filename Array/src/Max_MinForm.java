import java.util.LinkedList;
import java.util.Queue;

/*
Given sorted array of integers , rearrange array in such a way that the first position i=will have the
largest number the second will have the smallest , the third will have the second largest, and so on.
Using O(1) extra space
1,2,3,4,5,6,7,8,9,10,11,12,13,14

*/
public class Max_MinForm {
    public static void maxMinArrangement(int[] arr){
        int minInd=0;
        int maxInd=arr.length-1;
        int max=arr[maxInd]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[maxInd]%max)*max;  //important formula
                maxInd--;
            }else{
                arr[i]=arr[i]+(arr[minInd]%max)*max;  //important formula
                minInd++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/max;
        }
    }
    public static void print(int [] arr){
        for(int a:arr){
            System.out.print(a+"--->>>");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6,7,9,11,20};
        maxMinArrangement(arr);
        print(arr);

    }
}
