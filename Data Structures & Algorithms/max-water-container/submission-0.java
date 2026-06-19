class Solution {
    public int maxArea(int[] heights) {
        int maxHeight = 0;
        int l = 0;
        int r = heights.length - 1;

        while(l < r){
            int height = Math.min(heights[l], heights[r])*(r - l);
            maxHeight = Math.max(maxHeight, height);

            if(heights[l] <= heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxHeight;

    }
}
