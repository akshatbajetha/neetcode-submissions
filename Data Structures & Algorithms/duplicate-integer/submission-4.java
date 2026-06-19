class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set1 = new HashSet<>();

        for(int num: nums){
            if(set1.contains(num)) return true;
            set1.add(num);
        }

        return false;
    }
}