package com.gl.javafsd.lab3.binarySearchTree;

public class BinarySearchTree {

    private BinarySearchTreeNode root;

    // constructor-> assign null value to the root when object is created
    public BinarySearchTree(){
        this.root = null;
    }

    // inserts value to the tree by calling private method
    public BinarySearchTreeNode insert (Integer value){
        return insert(root,value);
    }


    // private method to insert values to the binary search tree
    private BinarySearchTreeNode insert( BinarySearchTreeNode Root , Integer value){

        // creates a new node with the value passed by the user/hardcoded
        BinarySearchTreeNode newnode = newNode(value);
        // used to iterate to the correct location for insertion
        BinarySearchTreeNode x= Root;
        // tracks the current parent for each insertion
        BinarySearchTreeNode current_parent = null;

        // this loop iterates to find the correct position for inserting the input value
        while (x!= null){
            current_parent = x;

            // value less than the data goes to the left node, so we move towards left node
            if(value < x.getData())
                x=x.getLeftNode();

            // value more than the data goes to the right node, so we move towards right node
            else if (value > x.getData())
                x=x.getRightNode();
            // if the value already exists in the BST, we end the insertion process
            else
                return newnode;
        }

        // if the root node is null, then we store the input value in the root
        if (current_parent == null) {
            current_parent = newnode;
            root = newnode;
        } // comparing input value with the data stored in the current node,
        // if it's less, then stored in the left node,
        // if it's more, then stored in the right node
        else if (value< current_parent.getData())
            current_parent.setLeftNode(newnode);
        else
            current_parent.setRightNode(newnode);

        return current_parent;
    }

    // method to return a new node of the BST
    private BinarySearchTreeNode newNode (Integer value){
        BinarySearchTreeNode newnode = new BinarySearchTreeNode (value);
        return newnode;
    }

    // method to get the root node of the tree
    public BinarySearchTreeNode getRoot(){
        return root;
    }

}
