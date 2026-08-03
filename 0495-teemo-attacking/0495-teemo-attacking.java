class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalSeconds = 0;
        for(int i = 0; i < (timeSeries.length - 1); i++ ) {
            int diff = timeSeries[i+1] - timeSeries[i];
            if(diff < duration) {
                totalSeconds += diff;
            } else {
                totalSeconds += duration;
            }
        }
        return totalSeconds + duration;
    }
}