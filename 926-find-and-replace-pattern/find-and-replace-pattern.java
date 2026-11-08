class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> result = new ArrayList<>();

        for (String word : words) {

            if (word.length() != pattern.length()) {
                continue;
            }

            int[] map1 = new int[26];
            int[] map2 = new int[26];

            boolean match = true;

            for (int i = 0; i < word.length(); i++) {

                int w = word.charAt(i) - 'a';
                int p = pattern.charAt(i) - 'a';

                if (map1[w] != map2[p]) {
                    match = false;
                    break;
                }

                map1[w] = i + 1;
                map2[p] = i + 1;
            }

            if (match) {
                result.add(word);
            }
        }

        return result;
    }
}