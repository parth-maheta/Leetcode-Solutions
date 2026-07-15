class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int start=0;
        int end=nums.length-1;

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[start]>nums[end]){
                res[i]=nums[start];
                start++;
            }
            else{
                res[i]=nums[end];
                end--;
            }
        }
    return res;
    }
}