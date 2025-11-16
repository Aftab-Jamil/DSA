public class RemovingEvenInteger {
    public static int[] removeEven(int [] arr){
        int oddLen=0;

        for(int i:arr){
            if(i%2!=0){
                oddLen++;
            }
        }
        int [] newArr=new int[oddLen];
        int index=0;
        for(int i:arr){
            if(i%2!=0){
                newArr[index]=i;
                index++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int [] arr={
                1,2,3,4,54,6,3,6,23,5,7
        };
        int [] newArr=removeEven(arr);
        for(int i:newArr){
            System.out.print(i + "  ");
        }


    }
}
