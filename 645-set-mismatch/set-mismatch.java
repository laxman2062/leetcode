class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = 0;
        int sum = 0;

        for (int num : nums) {
            if(!set.add(num)){
                duplicate = num;
            }
            sum += num;
        }
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int missing = expectedSum - (sum-duplicate);

        return new int[]{duplicate, missing};
    }
}