class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int res=Integer.MAX_VALUE;
        int sum=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                int len=right-left+1;
                res=Math.min(res,len);
                sum-=nums[left];
                left++;
            }
            right++;
        }
       return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}