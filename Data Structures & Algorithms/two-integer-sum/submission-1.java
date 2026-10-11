class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lengthOfArr= nums.length;
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int j=0;j<lengthOfArr;j++){
            int diff = target - nums[j];
            if(numMap.containsKey(diff)){
                return new int[]{numMap.get(diff), j};
            }
            numMap.put(nums[j],j);
        }
        return new int[]{};
    }
}
