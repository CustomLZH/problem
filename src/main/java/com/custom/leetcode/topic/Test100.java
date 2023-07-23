package com.custom.leetcode.topic;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 相同的树
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 状态：未完成
 * @Author: Custom
 * @Date: 2021/1/24 17:48
 * @Version: 1.0
 */
public class Test100 {
    public static void main(String[] args) {


        Test100 test100 = new Test100();

        System.out.println(test100.isSameTree(autoGenerateTree(), autoGenerateTree()));

    }


    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == q) {
            return true;
        }

        List<TreeNode> listOne =  new ArrayList<>();
        List<TreeNode> listTwo = new ArrayList<>();

        listTree(p, listOne);
        listTree(q, listTwo);

        if (listOne.size() != listTwo.size()) {
            return false;
        }


        for (int i = 0; i < listOne.size(); i++) {
            TreeNode treeNode = listOne.get(i);
            TreeNode treeNode1 = listTwo.get(i);
            if (treeNode == null || treeNode1 == null) {
                if (treeNode != treeNode1) {
                    return false;
                }
            }else {
                if (treeNode.val != treeNode1.val) {
                    return false;
                }
            }
        }

        return true;



    }



    public static void listTree(TreeNode p, List<TreeNode> list) {
        if (p != null) {
            listTree(p.left, list);
            list.add(p);
            listTree(p.right, list);
        }else {
            list.add(null);
        }
    }

    /**
     * 自动生成树
     * @return
     */
    public static TreeNode autoGenerateTree() {
        // A-Z的ASCII码是65-90，a-z的ASCII码是97-122
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
