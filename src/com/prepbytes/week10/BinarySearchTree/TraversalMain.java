package com.prepbytes.week10.BinarySearchTree;

public class TraversalMain {
    public static void main(String[] args) {
        var tree = new BinarySearchTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.print("PreOrder traversal is: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.print("InOrder traversal is: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.print("PostOrder traversal is: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Height of tree is: "+tree.heightOfTree(tree.root));
        System.out.println("Size of tree is: "+tree.sizeOfTree(tree.root));




    }
}
