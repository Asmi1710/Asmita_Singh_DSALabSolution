package com.gl.javafsd.lab3.binarySearchTree;

// class for defining nodes of BST
public class BinarySearchTreeNode {

    // stores the data in the node
    private Integer data;
    // stores the left and right nodes respectively
    private BinarySearchTreeNode leftNode;
    private BinarySearchTreeNode rightNode;

    // constructor- to create a node object storing the input value
    public BinarySearchTreeNode(Integer data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode= null;
    }

    // setter and getter methods for all the three variables
    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinarySearchTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinarySearchTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinarySearchTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
