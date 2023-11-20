package leetcode;

public class P9 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversedX = reverse(x);

        while (x > 0) {
            if (reversedX % 10 != x % 10) {
                return false;
            }

            reversedX /= 10;
            x /= 10;
        }

        return true;
    }

    private static int reverse(int x) {
        int reversed = 0;

        while (x > 0) {
            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }

        return reversed;
    }
}
