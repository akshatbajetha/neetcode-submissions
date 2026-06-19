class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for(int i : nums){
            if(result.contains(i)){
                return true;
            }
            result.add(i);
        }
        return false;
    }
}
