import java.util.*;

public class primeNum {
    public static boolean prime(int a){
        // corner case for 2
        if(a==2) return true;
        // for(int i=2;i<a;i++){ 
            for(int i=2;i<=Math.sqrt(a);i++){ // optimized solution 
            if(a%i==0) return false; // completely dividing or not
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(prime(num));
    }
}
