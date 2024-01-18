package Arrays;

import java.util.*;

public class reverseArray {
    public static void reverseArr(int arr[]) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            // Swapping the first and last
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            // incrementing first index and decrementing last index
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 elements of Array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        reverseArr(array);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
