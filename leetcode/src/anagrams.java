import java.util.HashMap;
import java.util.HashSet;

public class anagrams {
    public static boolean anagrams(String s1, String s2){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        char x;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        for(int i=0;i<s1.length();i++) {
            x = s1.charAt(i);
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        for(int i=0;i<s2.length();i++){
            x=s2.charAt(i);
            if(hashMap.containsKey(x)){
                hashMap.put(x,hashMap.get(x)-1);
                if(hashMap.get(x)<=0){
                    hashMap.remove(x);
                }
            }
            else{
                return false;
            }
        }
        if(hashMap.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(anagrams("anagrama","margana"));

    }
}
