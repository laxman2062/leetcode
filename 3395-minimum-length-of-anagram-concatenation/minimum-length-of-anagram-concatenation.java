class Solution {
    public int minAnagramLength(String s) {
        int n = s.length();

        for ( int len = 1; len <= n; len++) {
            if (n%len != 0) {
                continue;
            }

            int[] base = new int[26];
            for (int i = 0; i<len; i++) {
                base[s.charAt(i) - 'a']++;
            }

            boolean valid = true;

            for (int start = len; start < n; start += len) {

                int[] freq = new int[26];

                for (int i=start; i < start + len; i++) {
                    freq[s.charAt(i) - 'a']++;
                }

                for (int i=0; i < 26; i++) {
                    if (freq[i] != base[i]) {
                        valid = false;
                        break;
                    }
                }

                if (!valid) {
                    break;
                }
            }
            if (valid) {
                return len;
            }
        }
        return n;
    }
}