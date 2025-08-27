class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int n=Math.min(s1.length(),s2.length());
        int index=0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                index++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,index);
    }
}