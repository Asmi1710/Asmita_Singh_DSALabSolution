package com.gl.javafsd.lab3.binarySearchTree;


public class BSTPairFinderTest {

    // hardcoded input cases of sum
    public static void main(String[] args) {

        test(100);
        test(80);
        test(55);
        test(50);
        test(90);
        test (132);
    }

    // this method calls pairFinder method with the input sum
    private static void test(int sum) {

        BinarySearchTree tree = sample1();

        BinarySearchTreePairFinder finder
                = new BinarySearchTreePairFinder(tree);

        finder.findPair(sum);

        System.out.println("-----------------------");
    }


    // this method creates a tree with hardcoded values (same as given in the Question) and returns it
    private static BinarySearchTree sample1() {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(40);
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);

        return tree;
    }
}
