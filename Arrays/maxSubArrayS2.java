package Arrays;

public class maxSubArrayS2 {
    public static void maxSubArraySum(int array[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum sub array sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubArraySum(arr);
    }
}
