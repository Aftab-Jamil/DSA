public class MissingNumber {
    public static int findMissingNumber(int [] arr){
        // 1. find the length of an array
        int len=arr.length;
        // 2. it means array will contain 1 to len+1 element  in which one of them is missing
        // sum of len+1 natural number can be finded by using n(n+1)/2
        int sum=((len+1)*(len+2))/2;
        for(int i:arr){
            sum-=i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int [] arr={1,2,3,6,8,5,7};
        System.out.println(findMissingNumber(arr));

    }
}
