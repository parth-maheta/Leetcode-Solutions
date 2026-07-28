class Solution {
    public int square_sum(int n){
        int sum = 0;
        while(n > 0){
            int d = n % 10;
            sum += d * d;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n, fast = n;

        while (true) {
            slow = square_sum(slow);                    
            fast = square_sum(square_sum(fast));       

            if (fast == 1) return true;                 
            if (slow == fast) return false;             
        }
    }
}