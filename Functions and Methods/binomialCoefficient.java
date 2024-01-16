import java.util.*;

public class binomialCoefficient {
    public static int factorial(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }

    public static int binCoeff(int x, int y) {
        int a = factorial(x);
        int b = factorial(y);
        int c = factorial(x - y);
        int result = a / (b * c);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binCoeff(n, r));

    }
}
