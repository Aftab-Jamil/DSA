// A subsequence of a string is a new string formed from the original string by deleting some or no characters without
// changing the order of remaining characters.
// example: "ace" is a subsequence of "abcdef";
// example: "aec" is not a subsequence of "abcdef";
public class IsSubSequence {
    public static boolean isSubSequence(String str,String seq){
        if(seq.isEmpty()) return true;
        int i=0; // pointer for index of str
        int j=0; // pointer for index of seq
        while(i<str.length() && j<seq.length()){
            if(seq.charAt(j)==str.charAt(i)){
                j++;
            }
            i++;

        }
        return j==seq.length();
    }
    public static void main(String[] args) {
        String x="abcdef";
        System.out.println(isSubSequence("","ad"));

    }
}
