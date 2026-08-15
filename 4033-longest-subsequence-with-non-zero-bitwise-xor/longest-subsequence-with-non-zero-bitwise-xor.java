class Solution {
    public int longestSubsequence(int[] nums) {

        int xor = 0;
        int zeroCount = 0;
        int n = nums.length;

        for (int num : nums) {
            xor ^= num;

            if (num == 0) {
                zeroCount++;
            }
        }

        // Case 1: Whole array ka XOR non-zero hai
        if (xor != 0) {
            return n;
        }

        // Case 2: Saare elements 0 hain
        if (zeroCount == n) {
            return 0;
        }

        // Case 3: XOR = 0 but at least one non-zero exists
        return n - 1;
    }
}