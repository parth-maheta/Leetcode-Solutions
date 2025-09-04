class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] rs = new int[friends.length];
        int index = 0;

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    rs[index] = order[i];
                    index++;
                    break;
                }
            }
        }

        return rs;
    }
}