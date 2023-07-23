package com.custom.leetcode.everyday_topic;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集Ⅱ
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: liuzhaohong
 * @Date: 2021/3/31 10:27
 * @Version: 1.0
 */
public class Test_90 {
    public static void main(String[] args) {
        System.out.println(new Test_90().subsetsWithDup(new int[]{1,2,2}));
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        list.add(new ArrayList());

        int len = 1;
        for(int i = 0; i < nums.length; i++) {
            List<Integer> ints = new ArrayList();
            for(int j = i; j < len; j++) {
                ints.add(nums[j]);
            }
            list.add(ints);
            if(len < nums.length) {
                len++;
                i--;
            }else {
                len = i + 2;
            }
        }
        return list;
    }
}
