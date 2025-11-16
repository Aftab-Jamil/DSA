public class LongestCommonPrefix {
    public static String commonPrefix(String x,String y){
        StringBuilder prefix=new StringBuilder("");
        int len=Math.min(x.length(),y.length());
        for(int i=0;i<len;i++){
            if(x.charAt(i)!=y.charAt(i)){
                return prefix.toString();
            }
            prefix.append(x.charAt(i));
        }
        return prefix.toString();
    }
    public  static  String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            prefix=commonPrefix(prefix,strs[i]);
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
       String [] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
}
