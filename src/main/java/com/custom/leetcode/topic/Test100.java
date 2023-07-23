package com.custom.leetcode.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * 相同的树
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 状态：完成
 * @Author: Custom
 * @Date: 2021/1/24 17:48
 * @Version: 1.0
 */
public class Test100 {
    public static void main(String[] args) {


        Test100 test100 = new Test100();

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);

        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);
        treeNode1.right = new TreeNode(3);


        System.out.println(test100.isSameTree(treeNode, treeNode1));

    }


    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == q) {
            return true;
        }

        List<Integer> listOne =  new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();

        listTree(p, listOne);
        listTree(q, listTwo);

        if (listOne.size() != listTwo.size()) {
            return false;
        }


        for (int i = 0; i < listOne.size(); i++) {
            Integer treeNode = listOne.get(i);
            Integer treeNode1 = listTwo.get(i);
            if (treeNode == null || treeNode1 == null) {
                if (!Objects.equals(treeNode, treeNode1)) {
                    return false;
                }
            }else {
                if (!treeNode.equals(treeNode1)) {
                    return false;
                }
            }
        }

        return true;



    }


    /**
     * 树转数组
     * @param p
     * @param list
     */
    public static void listTree(TreeNode p, List<Integer> list) {
        if (p != null) {
            list.add(p.val);
            listTree(p.left, list);
            listTree(p.right, list);
        }else {
            list.add(null);
        }
    }

    /**
     * 自动生成树
     * @return 随机数
     */
    public static TreeNode autoGenerateTree() {
        Random random = new Random();
        int treeLength = random.nextInt(17) + 3;


        TreeNode head = new TreeNode();
        head.val = getVal();

        TreeNode point = head;
        for (int i = 1; i < treeLength; i++) {


            TreeNode treeNode = new TreeNode();
            treeNode.val = getVal();


            if (random.nextBoolean()) {
                point.left = treeNode;
            }else {
                point.right = treeNode;
            }
            point = treeNode;
        }
        return head;
    }

    public static int getVal() {
        Random random = new Random();
        int strLength = random.nextInt(7) + 3;
        String str = "";
        for (int j = 0; j < strLength; j++) {
            str += random.nextInt(9);
        }

        return Integer.parseInt(str);
    }

    /**
     * 树
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
