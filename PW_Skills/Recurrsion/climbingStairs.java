package PW_Skills.Recurrsion;

public class climbingStairs {
    public static int climbStairs(int n) {
// this problem solved as we solved fibbonacy series (curr= sum of previous two)
// way1 : recurrsion
        // if(n==0) return 1;
        // else if(n<0) return 0;
        // else return climbStairs(n-1)+climbStairs(n-2);
// way 2: memorization
        if(n==0 || n==1) return 1;
        int [] memo=new int [n+1];
        memo[0]=1;
        memo[1]=1;
        for(int i=2;i<memo.length;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n];
// way 2 optimize: optimized because we dont need to store more than 2  previous
        // if (n==1 || n==0){
        //     return 1;
        // }
        // int prev = 1, curr = 1;  // prev means at 0th stairs and curr at 1th stairs : we store only 2 previous
        // for (int i = 2; i <= n; i++) {
        //     int temp = curr;
        //     curr = prev + curr;
        //     prev = temp;
        // }
        // return curr;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
