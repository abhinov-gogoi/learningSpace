package com.prepbytes.week10.BinarySearchTree;

public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
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

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node node, int key) {
        /* If the tree is empty, return a new node */
        if (node == null) {
            node = new Node(key);
            return node;
        }

        /* Otherwise, recur down the tree */
        if (key<node.data)
            node.left = insertRec(node.left, key);
        else
            node.right = insertRec(node.right, key);

        /* return the (unchanged) node pointer */
        return node;
    }

    private int maxRight(Node node) {
        if (node.right != null)
            return maxRight(node.right);
        else
            return node.data;
    }

    public Node remove(Node node, int data) {
        if (node == null)
            return null;

        /* Otherwise, recur down the tree */
        if (data>node.data)
            node.right = remove(node.right, data);
        else if(data< node.data)
            node.left = remove(node.left, data);
        else{ // if data ==node.data
            if (node.left != null && node.right != null){
                // if node has both left and right child
                int lmax = maxRight(node.left);
                node.data = lmax;
                node.left = remove(node.left, lmax);
                return node;
            }
            else if(node.left != null)
                return node.left;
            else if(node.right != null)
                return node.right;
            else
                return null;
        }
        return node;
    }

}
