import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static boolean containsDuplicates(int [] arr){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else{
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(containsDuplicates(arr));

    }
}
