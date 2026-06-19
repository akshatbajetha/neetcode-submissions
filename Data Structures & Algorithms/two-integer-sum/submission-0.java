class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int firstNum = -1;
        int tempNum = -1;
        for(int i = 0; i < nums.length; i++){
            int secondNum = target - nums[i];
            if(map.containsKey(secondNum)){
                if(map.get(secondNum) > i){
                    firstNum = i;
                    tempNum = map.get(secondNum);
                }
                else{
                    firstNum = map.get(secondNum);
                    tempNum = i;
                }
                return new int[] {firstNum, tempNum};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
