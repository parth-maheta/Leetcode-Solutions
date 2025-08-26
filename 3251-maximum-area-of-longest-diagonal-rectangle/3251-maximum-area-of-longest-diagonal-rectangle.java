class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal=0;
        int maxarea=0;
        for(int[] arr : dimensions){
            int l=arr[0];
            int w=arr[1];
            int diag=l*l + w*w;
            int area=l*w;
            if(diag>maxDiagonal){
                maxDiagonal = diag;
                maxarea=area;
            }else if(diag==maxDiagonal){
                maxarea=Math.max(maxarea,area);
            }
        }
        return maxarea;
       
    }
}