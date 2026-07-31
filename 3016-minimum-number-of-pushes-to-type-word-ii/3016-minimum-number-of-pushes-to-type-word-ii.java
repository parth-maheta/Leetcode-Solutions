class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> frequencyMap=new HashMap<>();

        for(char c:word.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
        maxHeap.addAll(frequencyMap.values());

        int totalPushes=0;
        int i=0;
        while(!maxHeap.isEmpty()){
            totalPushes+=(i/8+1)*maxHeap.poll();
            i++;
        }
        return totalPushes;
    }
}