package com.gl.javafsd.lab3.binarySearchTree;

import java.util.LinkedHashSet;
import java.util.Set;

// class defining the core logic for finding the pair of nodes
public class BinarySearchTreePairFinder {

    private BinarySearchTree tree;
    private Boolean found = false;

    // constructor- to store the BST in the local variable as object is created
    public BinarySearchTreePairFinder(BinarySearchTree tree) {

        this.tree = tree;
    }

    // this public method creates a set of nodes and searches pair for the given sum
    public void findPair (int sum){
        Set<Integer> nodes= new LinkedHashSet<Integer>();
        findPairInternal(sum, tree.getRoot(), nodes);

        // if found= false after the process, prints the failure message
        if (!found) {
            System.out.println("For the sum ["
                    + sum + "], Matching nodes NOT found");
        }
    }

    // private method to search the nodes pair whose sum is also given as input
    private Boolean findPairInternal (int sum, BinarySearchTreeNode node, Set <Integer> nodes){

        // failed search process if the root is null i.e. BST is empty
        if (node== null)
            return false;
        // recursive call to move towards the left nodes
        found = findPairInternal(sum,node.getLeftNode(),nodes);

        // if sum is found in the left subtree, then success search process is returned
        if (found)
            return true;

        // finding the difference between the current node data and sum to determine the expected node value
        int difference= sum- node.getData();

        // finding expected node value in the set of nodes and if found, prints success message
        if (nodes.contains(difference)){
            found = true;
            System.out.println("For the sum [" + sum + "], Matching nodes -> [" + node.getData() + ", " + difference + "]");
            return found;
        }// adds the data of the node to the set
        else{
            nodes.add(node.getData());
        }

        // if search is unsuccessful in the left subtree, then start searching in the right subtree
        if (!found){
            return findPairInternal(sum,node.getRightNode(),nodes);
        }
        else
            return true;
    }
}
