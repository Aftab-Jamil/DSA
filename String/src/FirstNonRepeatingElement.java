import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static int firstNonReapeatingElement(String str){
        HashMap<Character,Integer> hashMap=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i),(hashMap.get(str.charAt(i))+1));
            }else{
                hashMap.put(str.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()==1){
                return str.indexOf(entry.getKey());
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstNonReapeatingElement("loveleetcode"));

    }
}
