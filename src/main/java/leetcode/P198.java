package leetcode;

public class P198 {
    public int rob(int[] nums) {
        int rob = 0;
        int norob = 0;
        for (int num : nums) {
            int newRob = norob + num;
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob, norob);
    }
}
