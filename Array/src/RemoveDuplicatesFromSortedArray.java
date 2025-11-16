// solution : we use same concept as we use in moving zeros at the end
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int [] arr){
        if(arr.length==0) return 0;
        int i=1;
        for(int j=1;j<arr.length;j++){
            if(arr[i-1]!=arr[j]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
//    public static int removeDuplicate(int [] arr){
//        if(arr.length==0) return 0;
//        int i=1;
//        for(int j=1;j<arr.length;j++){
//            if(arr[i-1]==arr[j]){
//                continue;
//            }
//            arr[i]=arr[j];
//            i++;
//        }
//        return i;
//    }

    public static void main(String[] args) {
        int [] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));

    }
}
