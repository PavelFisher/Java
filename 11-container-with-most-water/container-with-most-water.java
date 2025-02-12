class Solution {
    public int maxArea(int[] height) {
            int maxArea = 0;
            int left = 0;
            int right = height.length - 1;
            do {
                maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
                if (height[left] < height[right]) left++;
                else right--;
            } while (left < right);
            return maxArea;
    }
}