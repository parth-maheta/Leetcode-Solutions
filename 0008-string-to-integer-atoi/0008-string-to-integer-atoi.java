class Solution {
    public int myAtoi(String s) {
        int pointer = 0, n = s.length();
        int sign = 1;
        long res = 0;

        
        while (pointer < n && s.charAt(pointer) == ' ') {
            pointer++;
        }

        if (pointer < n && (s.charAt(pointer) == '-' || s.charAt(pointer) == '+')) {
            
            if(s.charAt(pointer) == '-'){
                sign=-1;
            }
            else{
                sign=1;
            }
            pointer++; 
        }

        while (pointer < n && Character.isDigit(s.charAt(pointer))) {
            res = res * 10 + (s.charAt(pointer) - '0');

            if (res > Integer.MAX_VALUE) {
                if(sign==1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }   
            }

            pointer++;
        }

        return (int) (res * sign);
    }
}
