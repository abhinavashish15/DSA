import java.util.*;

public class decToBin {

    public static void decToBinary(int x) {
        int binNum = 0;
        int pow = 0;
        while (x > 0) {
            int rem = x % 2;
            
            // now we find binary number
            binNum = binNum + rem * (int) Math.pow(10, pow);
            pow++;
            x = x / 2;
        }
        System.out.println(binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        decToBinary(sc.nextInt());

    }

}
