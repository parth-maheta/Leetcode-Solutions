class Solution {
    public int maximum69Number (int num) {
        String numCopy=num+"";
        StringBuilder s=new StringBuilder();
        boolean f=true;
        for(int i=0;i<numCopy.length();i++){
            if(numCopy.charAt(i)=='6'&& f){
                s.append('9');
                f=false;
            }
            else{
                s.append(numCopy.charAt(i));
            }
        }
        int ans=Integer.parseInt(String.valueOf(s));
        return ans;
    }
}