package com.qilonglu.hot.doublePointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        // 排序
        Arrays.sort(nums);
        int n = nums.length;

        // 去重
        for (int i = 0; i < n - 2; i++) {
            if (i != 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            // 双指针查找
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // 去重
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // 和太小，左指针右移
                } else {
                    right--; // 和太大，右指针左移
                }
            }
        }
        return res;
    }
}
