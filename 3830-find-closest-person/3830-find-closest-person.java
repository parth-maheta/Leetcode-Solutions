class Solution {
    public int findClosest(int x, int y, int z) {
        int a1 =Math.abs(z-x);
        int a2= Math.abs(z-y);

        if(a1<a2){
            return 1;
        }else if(a1>a2){
             return 2;
        }else{
            return 0;
        }
    }
}