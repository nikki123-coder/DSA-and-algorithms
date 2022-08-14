class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        HashMap<Integer,Integer> two_sum = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!two_sum.containsKey(target-nums[i])){
                 two_sum.put(nums[i],i);
                
            }
            else{
                result[0] = two_sum.get(target-nums[i]);
                result[1] = i;
                
            }
        }
        return result;
        
    }
}