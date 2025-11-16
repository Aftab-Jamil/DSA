//given the sorted array an yu have do the square of those element such their squares array is also sorted
// condition is that time complexity will be O(N)
public class SquareOfSortedArray {
    public static int [] squareOfSortedArray(int [] arr){
        int [] squareArray=new int[arr.length];
        int i=0,j=arr.length-1;
        int k=arr.length-1;
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                squareArray[k]=arr[i]*arr[i];
                k--;
                i++;
            }else{
                squareArray[k]=arr[j]*arr[j];
                k--;
                j--;
            }
        }
        return squareArray;
    }
    public static void print(int [] arr){
        for(int a:arr){
            System.out.print(a+"--->>>");
        }
    }
    public static void main(String[] args) {
        int [] arr={-4,-1,0,3,10};
        int [] sqr=squareOfSortedArray(arr);
        print(arr);
        System.out.println();
        print(sqr);


    }
}
