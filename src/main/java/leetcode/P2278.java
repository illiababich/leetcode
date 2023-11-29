package leetcode;

public class P2278 {
    public static int percentageLetter(String s, char letter) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(letter == s.charAt(i)) {
                counter++;
            }
        }

        return (counter * 100 / s.length());
    }
}
