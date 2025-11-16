public class SecondMaximum {
    public static int secondMaxInArray(int [] arr){
        int firstMax=0;
        int secondMax=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>firstMax) {
                secondMax=firstMax;
                firstMax = i;
            }
            if (i>secondMax&&i!=firstMax) {
                secondMax=i;
            }
        }

        return secondMax;
    }
    public static void main(String[] args) {
        int [] arr={
                13,34,2,34,33,31,55
        };
        System.out.println(secondMaxInArray(arr));
    }
}
