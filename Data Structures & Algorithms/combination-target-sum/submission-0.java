class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backTracker(nums,res,target,new ArrayList<>(),0);

        return res;
    }
    public void backTracker(int[] nums,List<List<Integer>> res,int target, List<Integer> curr,int i){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int j = i ; j < nums.length ; j++){
            if(nums[j] > target)    break;
            curr.add(nums[j]);
            backTracker(nums,res,target-nums[j],curr,j);
            curr.remove(curr.size()-1);
        }
    }
}
 