class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        int j = 0;

        for(int i = 0; i < 2*n; i++){
            if(i == n) j = 0;

            arr[i] = nums[j];
            j++;
        }
        return arr;
    }
}