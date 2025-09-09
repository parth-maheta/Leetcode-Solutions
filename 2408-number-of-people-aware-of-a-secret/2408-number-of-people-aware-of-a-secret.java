class Solution {
        int MOD= 1_000_000_007;
    public int f(int day,int delay,int forget,int[] dp){
        int result=0;
        if(day<=0) return 0;
        if(day==1) return 1;
        if(dp[day]!=-1) return dp[day];
        for(int i=day-forget+1 ; i<=day-delay ;i++){
            if(day>0){
            result= (int)((result + f(i,delay,forget,dp)) % MOD);

            }
        }
        return dp[day] = result;
    }
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int total = 0 ;
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        for(int i=n-forget+1;i<=n ; i++){
            if(i>0){
            total = (int)((total + f(i,delay,forget,dp)) % MOD);

            }
        }
        return total;
    }
}