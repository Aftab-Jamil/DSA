// Question: Given an Integer array arr and an integer value ,remove all occurrences of value in arr in place.
// The Order of elements may be changed. Then return the number of elements in arr that are not equal to value
// (Note : you should not have to use extra array or any data Structure )
// solution : move all element to end which equal to value (using move 0 at end concept)
public class RemoveElement {
    public static int removeElement(int [] arr, int value){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==value && arr[j]!=value){
                arr[i]=arr[j];
                arr[j]=value;
            }
            if(arr[i]!=value){
                i++;
            }

        }
        return i;
    }
    public static void main(String[] args) {
        int [] arr={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,2));

    }
}
