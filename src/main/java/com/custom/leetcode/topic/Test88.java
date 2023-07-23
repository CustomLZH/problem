package com.custom.leetcode.topic;

import java.util.Arrays;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *
 * 状态：完成
 * @Author: Custom
 * @Date: 2021/1/24 17:48
 * @Version: 1.0
 */
public class Test88 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 0, 0, 0};
        new Test88().merge(ints, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(ints));
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = nums1[i];
        }
        int i = 0;
        int j = 0;
        for (int ii = 0; i < m && j < n; ii++) {
            if (nums[i] < nums2[j]) {
                nums1[ii] = nums[i];
                i++;
            }else {
                nums1[ii] = nums2[j];
                j++;
            }
        }
        if (i < m) {
            for (int k = 0; k < m - i; k++) {
                nums1[i + j + k] = nums[k + i];
            }
        }else {
            for (int k = 0; k < n - j; k++) {
                nums1[i + j + k] = nums2[k + j];
            }
        }
    }
}

