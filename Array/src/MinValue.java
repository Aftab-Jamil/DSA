public class MinValue {
    public static int minValueInArray(int [] arr){
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min)
                min=i;
        }
        return  min;
    }
    public static void main(String[] args) {
        int [] arr={
                1,5,3,7,3,8,3,-9,4,88,-90,0
        };
        System.out.println(minValueInArray(arr));

    }
}
