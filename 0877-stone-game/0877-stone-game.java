class Solution {
    int[][] t = new int[501][501];
    int solve(int i,int j,int[] nums){
        if(i>j){
            return 0;
        }
        if(t[i][j]!=-1){
            return t[i][j];
        }
        if(i==j){
            return nums[i];
        }
        int take_i = nums[i] + Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        int take_j= nums[j] + Math.min(solve(i+1,j-1,nums),solve(i,j-2,nums));

        return t[i][j]= Math.max(take_i,take_j);
    }
    public boolean stoneGame(int[] piles) {
        int total=0;
        for (int[] row : t)
            Arrays.fill(row, -1);
        for(int i=0;i<piles.length;i++){
            total+=piles[i];
        }
        int alice_score=solve(0,piles.length-1,piles);
        int bob_score=total-alice_score;
        return alice_score>=bob_score;
    }
}