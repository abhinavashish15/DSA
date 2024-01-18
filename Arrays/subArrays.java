package Arrays;
/*
 * Generally it takes 3 nested loops 
 * Hence, their Time Complexity should be O(n^3) in thr worst case
 */
public class subArrays {
    public static void printSubArrays(int arr[]){
        int totalSubarray = 0;
        for(int i = 0; i < arr.length;i++){
            int start=arr[i];
            for(int j = i; j < arr.length; j++){
                int end=arr[j];
                for(int k=i;k<end;k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays are "+totalSubarray);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printSubArrays(arr);
    }
}
