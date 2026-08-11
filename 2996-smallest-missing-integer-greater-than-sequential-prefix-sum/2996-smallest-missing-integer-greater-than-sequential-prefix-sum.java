class Solution {
    public int missingInteger(int[] nums) {
        int seqsum = nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                seqsum+=nums[i];
            }
            else{
                break;
            }
        }
        Set<Integer> st= new HashSet<>();
              
        for (int num : nums) {
            st.add(num); 
        }
        while(st.contains(seqsum)){
    seqsum++;
}
        return seqsum;


    }
}