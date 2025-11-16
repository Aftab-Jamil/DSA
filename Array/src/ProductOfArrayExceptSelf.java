public class ProductOfArrayExceptSelf {
    public static int [] productOfArrayExceptSelf(int [] array){
        if(array.length==0) return new int[0];
        int [] result=new int[array.length];
        int temp=1;
        result[0]=1;
        for(int i=1;i<result.length;i++){
            temp*=array[i-1];
            result[i]=temp;
        }
        temp=1;
        for(int i=result.length-1;i>=0;i--){
            temp*=array[i+1];
            result[i]=result[i]*temp;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
