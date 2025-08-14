class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        HashSet<Integer> s=new HashSet<>();
        int a=-1,b=-1;
        for(int[] row : grid){
            for(int num: row){
                if(s.contains(num)){
                    a=num;
                }
                else{
                    s.add(num);
                }
            }
        }
        for(int i=1;i<=size;i++){
            if(!s.contains(i)){
                b=i;
                break;            }
        }
        return new int[]{a,b};
    }
}