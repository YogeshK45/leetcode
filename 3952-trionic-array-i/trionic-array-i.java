class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        boolean[] inc = new boolean[n];
        boolean[] dec = new boolean[n];
        inc[0] = true;
        for (int i = 1; i < n; i++) {
            inc[i] = inc[i - 1] && nums[i] > nums[i - 1];
        }
        dec[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = dec[i + 1] && nums[i] < nums[i + 1];
        }
        for (int p = 1; p < n - 2; p++) {
            if (!inc[p]) continue;

            for (int q = p + 1; q < n - 1; q++) {

                boolean decreasing = true;
                for (int k = p + 1; k <= q; k++) {
                    if (nums[k] >= nums[k - 1]) {
                        decreasing = false;
                        break;
                    }
                }

                if (decreasing && dec[q]) {
                    return true;
                }
            }
        }

        return false;
    }
}
