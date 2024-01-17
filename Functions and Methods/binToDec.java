import java.util.*;

public class binToDec {
    public static void binToDecimal(int x) {
        // int num = x;
        int pow = 0;
        int dec = 0;
        while (x > 0) {
            int last = x % 10;
            // Math.pow() returns the double value so we have to typecast it to int
            dec += (last * (int) Math.pow(2, pow));
            pow++;
            x = x / 10;
        }
        // System.out.println("The decimal of "+num+" is "+dec);
        System.out.println(dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binToDecimal(sc.nextInt());
    }

}
