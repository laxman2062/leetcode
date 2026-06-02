import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int minLen = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if(!first.containsKey(num)) {
                first.put(num, i);
            }

            freq.put(num, freq.getOrDefault(num, 0) + 1);

            int count = freq.get(num);

            if(count > degree) {
                degree = count;
                minLen = i - first.get(num) + 1;
            }
            else if(count == degree) {
                minLen = Math.min(
                    minLen,
                    i - first.get(num) + 1
                );
            }
        }

        return minLen;
    }
}