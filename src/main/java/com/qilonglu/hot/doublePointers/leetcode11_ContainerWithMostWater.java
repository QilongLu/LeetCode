package com.qilonglu.hot.doublePointers;

public class leetcode11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int res = 0;
        int right = height.length - 1;
        int left = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                res = Math.max(Math.min(height[left], height[right]) * (right - left), res);
                left++;
            } else {
                res = Math.max(Math.min(height[left], height[right]) * (right - left), res);
                right--;
            }
        }
        return res;
    }
}
