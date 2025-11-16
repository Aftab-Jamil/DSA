public class Reversing {
//    public static int[] reversing(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        int [] arr={
//                1,2,4,2,4,6,2,8
//        };
//        int [] newArr=reversing(arr);
//        for (int i:newArr){
//            System.out.print(i+"  ");
//        }
//
//    }
/*
Below and above the difference is that in reversing function first we return in second we dont
see - when i pass an array to a function(reversing) then according to parameter a new pointer
is created which points to that array so when i make changes in it then it will reflect to
original array But if i reassign the arr in reversing function then it will reflect to orginal
pointer to array because both pointer to the same array is different
              1.original pointer to array____________
                (which is in main method)           |
                                                 {1,2,3,4,56}
                                                     |
             2.pointer created for function -----------
     - now if i make changes in it then it will reflect to original array
     - if we re-assign pointer 2 then that pointer points to diffrent array so that pointer 1 have
     no effect on it

 */

    public static void reversing(int[] arr){
//        int [] temp3={1,2,3,4};
//        arr=temp3;
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }



    }

    public static void main(String[] args) {
        int [] arr={
                1,2,4,2,4,6,2,8
        };
       reversing(arr);
        for (int i:arr){
            System.out.print(i+"  ");
        }

    }

}
