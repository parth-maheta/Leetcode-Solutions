class Solution {
    public int f(int ind,ArrayList<Integer> arr,int[] dp){
        if(ind==0) return arr.get(0);
        if(ind<0) return 0;
        if(dp[ind] != -1) return dp[ind];
        int pick = arr.get(ind) + f(ind-2,arr,dp);
        int notpick = f(ind-1 , arr, dp);
        return dp[ind] = Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        ArrayList<Integer> temp1= new ArrayList<>();
    ArrayList<Integer> temp2=new  ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0) temp1.add(nums[i]);
            if(i!=n-1) temp2.add(nums[i]);
        }
    int[] dp1=new int[temp1.size()];
    int[] dp2=new int[temp2.size()];
    Arrays.fill(dp1,-1);
    Arrays.fill(dp2,-1);
       int ans1=f(temp1.size()-1,temp1,dp1);
       int ans2=f(temp2.size()-1,temp2,dp2);

       return Math.max(ans1,ans2);
    }
}