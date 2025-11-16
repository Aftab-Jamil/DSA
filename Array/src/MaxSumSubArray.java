// Implementation of kedans algorithm
public class MaxSumSubArray {
    public static int maxSumSubArray(int [] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            // currentSum is taken as arr[i] that mean currentSum had negative value
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1};
        System.out.println(maxSumSubArray(arr));

    }
}
