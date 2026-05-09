class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, new ArrayList<>(), result);

       return result;
    }

    private void backtracking(int[] nums, List<Integer> path, List<List<Integer>> result){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int num: nums){
            if(path.contains(num)){
                continue;
            }
            path.add(num);
            backtracking(nums,path,result);
            path.remove(path.size()-1);
        }
    } 
}