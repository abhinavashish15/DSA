package Arrays;
/*
 * for pairs we use the concept of 'Nested Loops'
 */
public class printPairs {
    public static void pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];
                System.out.print("(" + first + "," + second + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        pairs(arr);
    }

}
