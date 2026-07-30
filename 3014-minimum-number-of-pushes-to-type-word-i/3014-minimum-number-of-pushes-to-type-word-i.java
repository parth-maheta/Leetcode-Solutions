class Solution {
    public int minimumPushes(String word) {
        int totalpushes=0;
        for(int i=0;i<word.length();i++){
            totalpushes+=(i/8)+1;
            
        }
        return totalpushes;
    }
}