//Moving zero integer at the end of array in such a way you have to maintain
// the order of non-zero element
public class MovingZeroToEnd {
    // written By me
//    public static int [] movingZeroToTheEnd(int [] arr){
//        int i=0,j=0;
//        for(i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                for(j=i+1;j<arr.length;j++){
//                    if(arr[j]!=0)
//                        break;
//                }
//                if(j==arr.length){
//                    System.out.println("all ends are zero so that loop is break to reduce time complexity");
//                    break;
//                }
//                if(j<arr.length) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr;
//    }
    // According to tutorial : which took less time complexity
    public static int [] movingZeroToTheEnd(int [] arr){
        int i,j=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                //swapping
                arr[j]=arr[i];
                arr[i]=0;
            }
            if(arr[j]!=0)
                j++;
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] arr={
                13,34,0,2,34,0,-9,33,31,55
        };
        int [] newArr=movingZeroToTheEnd(arr);
        for(int i:newArr){
            System.out.print(i+"  ");
        }

    }
}
