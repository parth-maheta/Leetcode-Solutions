class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result_sum=0;
        Arrays.sort(nums);
        int n=nums.length;
        int max_diff=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(sum-target);
                if(diff<max_diff){
                    max_diff=diff;
                    result_sum=sum;
                }
                if(sum==target){
                    left++;
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result_sum;
    }
}