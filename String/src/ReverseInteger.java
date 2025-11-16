import java.sql.SQLOutput;

public class ReverseInteger {
    public static int reverseInteger(int value){
        int result=0;
        int remainder;
        while(value!=0){
            remainder=value%10;
            // Below these if is to cheak is the reverse is going to the out of range if yes then return 0
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE && remainder>7)) return 0;
            if(result<Integer.MIN_VALUE/10 || (result==Integer.MIN_VALUE/10 && remainder<-8)) return 0;
            result=result*10+remainder;
            value=value/10;
        }

        return result;

    }
    public static void main(String[] args) {
        System.out.println(reverseInteger(-1234));

    }
}
