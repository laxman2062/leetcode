class Solution {
    public boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() -1)) {
            return false;
        }

        for(int i=0;i<sentence.length(); i++) {
            if(sentence.charAt(i) == ' ') {
                char prev = sentence.charAt(i-1);
                char next = sentence.charAt(i+1);

                if(prev != next) {
                    return false;
                }
            }
        }
        return true;
    }
}