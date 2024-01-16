import java.util.*;

class factorial {
    // create function to find Factorial
    public static int findFactorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // System.out.println(findFactorial(a));
        int result = findFactorial(a);
        System.out.println(result);
    }
}
