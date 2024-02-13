public class palindromeStrings {
    public static void palindrome(String var0) {
        int var1 = 0;

        for (int var2 = 0; var2 < var0.length(); ++var2) {
            if (var0.charAt(var2) != var0.charAt(var0.length() - 1 - var2)) {
                ++var1;
            }
        }
        if (var1 > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

    public static void main(String[] var0) {
        String var1 = "racecr";
        palindrome(var1);
    }
}
