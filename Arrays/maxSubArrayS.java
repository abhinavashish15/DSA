package Arrays;

public class maxSubArrayS {
    public static int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int result = maxSubArraySum(array);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
