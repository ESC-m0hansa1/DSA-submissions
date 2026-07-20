class Solution {
    Integer[] dp;

    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1)  return nums[0];
        dp = new Integer[n];
        
        return rec(nums,n-1);
    }
    public int rec(int[] nums,int idx){
        if(idx == -1 || idx == -2)   return 0;
        if(dp[idx] != null) return dp[idx];
        int rob = nums[idx] + rec(nums,idx-2);
        int skip = rec(nums,idx-1);
        dp[idx] = Math.max(rob,skip);
        return dp[idx];
        
    }
}
