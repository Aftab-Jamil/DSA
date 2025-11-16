import java.util.Set;

public class RemoveVowels {
    public static StringBuffer removeVowel(String str){
        Set<Character> set= Set.of('a','e','i','o','u');
        str=str.toLowerCase();
        StringBuffer result=new StringBuffer();
        char temp;
        for(int i=0;i<str.length();i++){
            temp=str.charAt(i);
            if(!set.contains(temp)){
                result.append(temp);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(removeVowel("what is your name"));

    }
}
