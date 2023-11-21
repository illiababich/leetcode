package leetcode;

public class P67 {

    public static String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0) {
            int round = carry;
            if(i >= 0) round += a.charAt(i--) - '0';
            if(j >= 0) round += b.charAt(j--) - '0';
            carry = round > 1 ? 1 : 0;

            answer.insert(0, round  % 2);
        }
        if (carry != 0) {
            answer.insert(0, carry);
        }

        return answer.toString();
    }
}
