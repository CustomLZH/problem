package com.custom.leetcode.topic;

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 状态：完成
 * @Author: Custom
 * @Date: 2021/1/24 17:48
 * @Version: 1.0
 */
public class Test69 {
    public static void main(String[] args) {
        System.out.println(new Test69().mySqrt(56));
    }

    public int mySqrt(int x) {
        if (x == 1)
            return 1;
        int left = 0;
        int right = x;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (x / middle < middle)
                right = middle;
            else
                left = middle;
        }
        return left;
    }
}
