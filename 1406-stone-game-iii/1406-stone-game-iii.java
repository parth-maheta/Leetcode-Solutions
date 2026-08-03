class Solution {
    
    int[] t;
    int solve(int[] stoneValue,int i){
        int n=stoneValue.length;
        if(i>=n){
            return 0;
        }
        if(t[i]!=Integer.MIN_VALUE){
            return t[i];
        }
        int result=stoneValue[i] - solve(stoneValue,i+1);
        if(i+1<n){
            result=Math.max(result,stoneValue[i]+stoneValue[i+1] - solve(stoneValue,i+2));
        }
        if(i+2<n){
            result=Math.max(result,stoneValue[i]+stoneValue[i+1]+stoneValue[i+2] - solve(stoneValue,i+3));
        }
        return t[i]=result;
    }
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        
        t=new int[n];
        Arrays.fill(t,Integer.MIN_VALUE);
        int diff=solve(stoneValue,0);
        if(diff<0){
            return "Bob";
        }
        else if(diff>0){
            return "Alice";
        }
        else{
            return "Tie";
        }
    }
}