package com.prepbytes.week10.BinarySearchTree;

public class TreeTraversal {
    Node root;
    TreeTraversal(){
        root = null;
    }

    void preOrderTraversal(Node node){
        if (node == null)
            return;
        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void inOrderTraversal(Node node) {
        if (node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);
    }

    void postOrderTraversal(Node node) {
        if (node == null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");
    }

    int heightOfTree(Node node) {
        if (node==null)
            return -1;
        else {
            int leftHeight = heightOfTree(node.left);
            int righHeight = heightOfTree(node.right);

            if (leftHeight>righHeight) return leftHeight+1;
            else return righHeight+1;
        }
    }
    int sizeOfTree(Node node) {
        if (node==null)
            return 0;
        else {
            int leftSize = sizeOfTree(node.left);
            int rightSize = sizeOfTree(node.right);
            return  leftSize+rightSize+1;
            // return (sizeOfTree(node.left)+sizeOfTree(node.right)+1);   else block in single line
        }

    }

}
