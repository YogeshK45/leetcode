class Solution {
    public int climbStairs(int n) {
        int[] memo=new int[n+1];
        return helper(n,memo);
    }

    static int helper(int n,int[] memo){
        if(n==0 || n==1) return 1;

        if(memo[n] != 0) return memo[n];

        int one = helper(n-1,memo);
        int two = helper(n-2,memo);

         memo[n]=one+two;
         return memo[n];
    }
}