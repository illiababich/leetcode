package leetcode;

public class P1108 {
    public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                result.append(address.charAt(i));
            } else {
                result.append("[.]");
            }
        }

        return result.toString();
    }
}