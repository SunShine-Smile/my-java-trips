package com.jason.algorithm.tree;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode() {

    }

    public TreeNode(int value) {
        this.value = value;
    }
}
