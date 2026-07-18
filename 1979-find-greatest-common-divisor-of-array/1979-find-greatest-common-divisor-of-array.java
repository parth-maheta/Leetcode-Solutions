class Solution {
    public int findGCD(int[] nums) {
        int mn=nums[0];
        int mx=nums[0];
        for(int i=0;i<nums.length;i++){
            mn=Math.min(mn,nums[i]);
            mx=Math.max(mx,nums[i]);
        }
        return gcd(mn,mx);
    }
    int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}