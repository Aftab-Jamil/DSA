import java.util.LinkedList;
import java.util.Queue;

public class generateBinaryNumberFrom1ToN {
    public static String [] genereateBN(int size){
        if(size>=0) {
            Queue<String> queue = new LinkedList<>();
            String[] arr = new String[size];
            queue.add("1");
            for (int i = 0; i < size; i++) {
                String x = queue.poll();
                arr[i] = x;
                String nextAppendedValue = x + "0";
                String nextToNextAppendedValue = x + "1";
                queue.add(nextAppendedValue);
                queue.add(nextToNextAppendedValue);

            }
            return arr;
        }else{
            System.out.println("please Enter Positive Number");
            return new String[0];
        }
    }
    public static void main(String[] args) {
        String [] binaryNumbers= genereateBN(9);
        for(String binary:binaryNumbers){
            System.out.println(binary);
        }

    }
}
