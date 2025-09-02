class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int n=nums.length;
        if(n==0) return 0;
        int highest = 1;
        for(int i=0;i<n;i++){
            h.add(nums[i]);
        }
        for(int num : h){
            if(!h.contains(num-1)){

            int count=1;
            int x=num;
            while(h.contains(x+1)){
                x+=1;
                count+=1;
            }
            highest= Math.max(highest,count);
            }
        }
        return highest;
    }
}