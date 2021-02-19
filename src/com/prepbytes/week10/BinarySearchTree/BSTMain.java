package com.prepbytes.week10.BinarySearchTree;

public class BSTMain {
    public static void main(String[] args) {
        var tree = new BinarySearchTree();
        /*

              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80

       */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("PreOrder traversal is: ");
        tree.preOrderTraversal(tree.root);
    }
}
