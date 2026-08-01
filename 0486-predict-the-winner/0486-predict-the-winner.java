class Solution {
    int solve(int i,int j,int[] nums){
        int n=nums.length;
        if(i>j){
            return 0;
        }
        if(i==j){
            return nums[i];
        }
        int take_i = nums[i] + Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        int take_j= nums[j] + Math.min(solve(i+1,j-1,nums),solve(i,j-2,nums));
        return Math.max(take_i,take_j);
    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int total_sum=0;
        for(int i=0;i<n;i++){
            total_sum+=nums[i];
        }
        int p1_score=solve(0,n-1,nums);
        int p2_score=total_sum-p1_score;
        return p1_score>=p2_score;
    }
}