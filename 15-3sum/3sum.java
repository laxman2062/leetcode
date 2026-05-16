class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
        int j=i+1;
        int k=nums.length-1;
        int target = -nums[i];
        while(j<k){
            if(nums[j]+nums[k]==target){
                set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }
            else if (nums[j]+nums[k]<target){
                j++;
            }
            else k--;

        }
            
        }
        result.addAll(set);
        return result;
    }
}