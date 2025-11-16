public class palindrom {
    public static boolean isPalindrome(String x){
        int lengthOfString=x.length();
        for(int i=0;i<lengthOfString/2;i++){
            if(x.charAt(i)!=x.charAt(lengthOfString-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="madam";
        System.out.println(isPalindrome(s));

    }
}
