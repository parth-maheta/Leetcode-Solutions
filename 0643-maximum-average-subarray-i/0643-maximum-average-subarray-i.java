class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double res=Double.MIN_VALUE;
        int win_sum=0;
        for(int i=0;i<k;i++){
            win_sum+=nums[i];
        }
        
        res=win_sum;
        for(int i=k;i<n;i++){
            win_sum=win_sum+nums[i]-nums[i-k];
            res=Math.max(res,win_sum);
        }
        
        return res/k;
    }
}