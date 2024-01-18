// Time Complexity of Linear Search [worst case]: O(n)

package Arrays;

import java.util.*;

public class linearSearch {
    public static int linearS(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter " + arr.length + " numbers in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search in Array: ");
        int key = sc.nextInt();
        int index = linearS(arr, key);
        System.out.println(key + " is found at position " + index);
    }
}
