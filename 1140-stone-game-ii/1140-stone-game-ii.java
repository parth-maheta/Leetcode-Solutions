class Solution {
    int[][][] dp;
    public int solve(int[] piles,int person,int i, int m){
        int n=piles.length;
        if(i>=n){
            return 0;
        }
          if (dp[person][i][m] != -1) {
            return dp[person][i][m];
        }

        int result = (person==1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int stones=0;
        for(int x=1;x<=Math.min(2*m,n-i);x++){
            stones+=piles[i+x-1];
            if(person==1){
                result= Math.max(result,stones+solve(piles,0,i+x,Math.max(m,x)));

            }
            else{
                result=Math.min(result, solve(piles,1,i+x,Math.max(m,x)));
            }
        }
        return dp[person][i][m] = result;
    }
    public int stoneGameII(int[] piles) {
        int n= piles.length;
        dp = new int[2][n][n + 1];

        for (int p = 0; p < 2; p++) {
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[p][i], -1);
            }
        }
        return solve(piles,1,0,1);
    }
}