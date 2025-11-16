import java.util.*;

public class LongestSubStringWithoutRepeating {
    
    public static int longestSubString(String str){
        Set<Character> set=new HashSet<>();
        Queue<Character> queue=new LinkedList<>();
        int max=0,currentMax=0;
        char t;
        for(int i=0;i<str.length();i++){
            t=str.charAt(i);
            if(set.contains(t)){
                while(set.contains(t)){
                    char temp=queue.poll();
                    set.remove(temp);
                    currentMax--;
                }
            }
            set.add(t);
            queue.add(t);
            currentMax++;
            max=Math.max(max,currentMax);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(longestSubString(""));

    }
}
