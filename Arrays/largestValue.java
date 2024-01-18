package Arrays;

import java.util.*;

public class largestValue {
    public static int largestNum(int arr[]) {
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largestNumber < arr[i]) {
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Enter 5 elements in array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("largest value in Array is " + largestNum(array));
    }
}
