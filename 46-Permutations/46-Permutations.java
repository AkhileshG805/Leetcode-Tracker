// Last updated: 7/9/2026, 3:14:11 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        bt(nums,new ArrayList<>(),res);
        return res;
    }
    void bt(int[] nums,List<Integer> curr,List<List<Integer>> res){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
        }else{
            for(int i=0;i<nums.length;i++){
                if(curr.contains(nums[i])){
                    continue;
                }
                curr.add(nums[i]);
                bt(nums,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
}
