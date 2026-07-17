class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int low=0;
        Map<Character,Integer> freq=new HashMap<>();
        int res=0;
        for(int right=0;right<n;right++){
            freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right),0)+1);
            int len=right-low+1;
            while(freq.size()<len){
                freq.put(s.charAt(low),freq.get(s.charAt(low))-1);
                if(freq.get(s.charAt(low))==0){
                    freq.remove(s.charAt(low));
                }
                low++;
                len=right-low+1;
            }
           
            res=Math.max(res,right-low+1);
        }
        return res;
    }
}