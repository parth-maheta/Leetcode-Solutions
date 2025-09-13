class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int v=0,c=0;
        for(char ch : s.toCharArray()){
            int i=ch-'a';
            freq[i]++;
            if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch == 'u'){
                v=Math.max(v,freq[i]);
            }
            else{
                c=Math.max(c,freq[i]);
            }
        }
        return v+c;
    }
}