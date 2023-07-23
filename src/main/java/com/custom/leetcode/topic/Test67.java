package com.custom.leetcode.topic;

/**
 * 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * 提示：
 *
 *     每个字符串仅由字符 '0' 或 '1' 组成。
 *     1 <= a.length, b.length <= 10^4
 *     字符串如果不是 "0" ，就都不含前导零
 *
 * 状态：完成
 * @Author: liuzhaohong
 * @Date: 2021/3/16 16:57
 * @Version: 1.0
 */
public class Test67 {
    public static void main(String[] args) {
        System.out.println(new Test67().addBinary1("110", "10101"));
        System.out.println(new Test67().addBinary("110", "10101"));
        System.out.println(new Test67().addBinary2("110", "10101"));
    }
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = 0;
        for (; a.length() - i > 0 && b.length() - i > 0; i++) {
            int i1 = carry + Integer.parseInt(a.charAt(a.length() - i - 1) + "") + Integer.parseInt(b.charAt(b.length() - i - 1) + "");
            sb.append(i1 % 2);
            if (i1 > 1){
                carry = 1;
            }else {
                carry = 0;
            }
        }
        String str = "";
        if (a.length() > i) {
            str = a;
        }else {
            str = b;
        }
        for (; str.length() - i > 0; i++) {
            int i1 = carry + Integer.parseInt(str.charAt(str.length() - i - 1) + "");
            sb.append(i1 % 2);
            if (i1 > 1){
                carry = 1;
            }else {
                carry = 0;
            }
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public String addBinary2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int length = a.length() - b.length();
        String minLength = "";
        if (length > 0) {
            minLength = b;
        }else {
            minLength = a;
            a = b;
        }

        b = "";
        for (int i = 0; i < length * length / 2; i++) {
            b += "0";
        }
        b += minLength;

        int carry = 0;
        int i = 0;
        for (; a.length() - i > 0 && b.length() - i > 0; i++) {
            int i1 = carry + Integer.parseInt(a.charAt(a.length() - i - 1) + "") + Integer.parseInt(b.charAt(b.length() - i - 1) + "");
            sb.append(i1 % 2);
            if (i1 > 1){
                carry = 1;
            }else {
                carry = 0;
            }
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }




    public String addBinary1(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
}
