class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> st = new HashSet<>();
        int n = s.length();
        int count = 0;

        
        for (int i = 0; i < n; i++) {
            st.add(s.charAt(i));
        }

     
        for (char letter : st) {
            int left = -1, right = -1;

          
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == letter) {
                    if (left == -1) {
                        left = i;
                    }
                    right = i;
                }
            }

            HashSet<Character> s1 = new HashSet<>();
            for (int mid = left + 1; mid < right; mid++) {
                s1.add(s.charAt(mid));
            }

            count += s1.size();
        }

        return count;
    }
}
