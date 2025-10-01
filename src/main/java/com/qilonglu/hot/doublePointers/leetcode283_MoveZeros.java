package com.qilonglu.hot.doublePointers;

import java.util.Arrays;

public class leetcode283_MoveZeros {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 0, 0, 3, 0, 0, 0, 4, 0, 5, 6, 7, 0, 8, 9, 0, 0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
