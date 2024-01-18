package Arrays;
/*
 * In Binary Search, the Array elements should be sorted either in ascending order or descending order
 * Time Complexity of Binary Search(worst case): O(log n)
 */
import java.util.*;

public class binarySearch {
    public static int binaryS(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter element to search in Array: ");
        int key = sc.nextInt();
        System.out.println(key + " found at position " + binaryS(array, key));
    }

}
