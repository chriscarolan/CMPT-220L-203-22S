package com.company;

public class BST {
    class Node {
        int key;
        Node left;
        Node right;
        public Node(int key) {
            this.key = key;
        }
    }
    Node root;
    public void insert(int key){
        root = insert(root, key);
    }
    public Node insert(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key<root.key){
            root.left = insert(root.left, key);
        }
        else if (key>root.key){
            root.right = insert(root.right, key);
        }
        return root;
    }
}
