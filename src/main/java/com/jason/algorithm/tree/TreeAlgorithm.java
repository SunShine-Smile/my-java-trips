package com.jason.algorithm.tree;

/**
 * @author Jason
 * @date 2019年7月18日 上午11:40:20
 * @desc 树的算法
 */
public class TreeAlgorithm {

    /**
     * 前序遍历 --> 递归
     * 描述：
     * 1、如果二叉树为空，空操作
     * 2、如果二叉树不为空，访问根节点，前序遍历左子树，前序遍历右子树
     *
     * @param root
     */
    public static void preorderTraversalRec(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + "--> ");
        preorderTraversalRec(root.getLeft());
        preorderTraversalRec(root.getRight());
    }

    /**
     * 中序遍历 --> 递归
     * 描述：
     * 1、如果二叉树为空，空操作
     * 2、如果二叉树不为空，中序遍历左子树，访问根节点，中序遍历右子树
     *
     * @param root
     */
    public static void inorderTraversalRec(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversalRec(root.getLeft());
        System.out.print(root.getValue() + "--> ");
        inorderTraversalRec(root.getRight());
    }

    /**
     * @param root
     */
    public static void postorderTraversalRec(TreeNode root) {

    }

    public static void main(String[] args) {
        TreeNode root = assembleTreeNode();
        preorderTraversalRec(root);
        System.out.println();
        inorderTraversalRec(root);
    }

    public static TreeNode assembleTreeNode() {
        TreeNode leftLeft = new TreeNode();
        leftLeft.setValue(3);
        TreeNode leftRight = new TreeNode();
        leftRight.setValue(4);
        TreeNode left = new TreeNode();
        left.setValue(1);
        left.setLeft(leftLeft);
        left.setRight(leftRight);

        TreeNode rightLeft = new TreeNode();
        rightLeft.setValue(5);
        TreeNode rightRight = new TreeNode();
        rightRight.setValue(6);
        TreeNode right = new TreeNode();
        right.setValue(2);
        right.setLeft(rightLeft);
        right.setRight(rightRight);

        TreeNode root = new TreeNode();
        root.setValue(0);
        root.setLeft(left);
        root.setRight(right);
        return root;
    }
}
