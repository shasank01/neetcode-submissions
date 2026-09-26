class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 0;
        Set<Integer> numSet = new HashSet<>();
        boolean hasDuplicate = false;
        for(int num : nums){
            if(!numSet.add(num)){
                hasDuplicate =  true;
            }
        }
        return hasDuplicate;
    }
}