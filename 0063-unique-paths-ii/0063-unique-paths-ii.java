class Solution {
    public int f(int row,int col,int[][] dp,int[][] obstacleGrid){
        if(row>=0 && col>=0 && obstacleGrid[row][col]==1) return 0;
        if(row==0 && col==0){
            return 1;
        }
        if(row<0 || col <0) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        int up = f(row-1,col,dp,obstacleGrid);
        int left = f(row,col-1,dp,obstacleGrid);
        return dp[row][col] = up+left;
        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid[0].length;
        int m=obstacleGrid.length;
        int[][] dp=new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return f(m-1,n-1,dp,obstacleGrid);
    }
}