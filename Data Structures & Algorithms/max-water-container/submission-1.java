class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;

        int l = 0;
        int r = heights.length - 1;

        while(l < r){
            int smaller = Math.min(heights[l], heights[r]);
            int breadth = r - l;

            int area = smaller*breadth;

            maxArea = Math.max(maxArea, area);

            if(heights[l] < heights[r]) l++;
            else if (heights[l] >= heights[r]) r--;
        }

        return maxArea;
    }
}
