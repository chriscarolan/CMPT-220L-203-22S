package com.company;

import java.util.ArrayList;

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
    public Node insert(int key){
        root = insert(root, key);
        return root;
    }
    public Node insert(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key<=root.key){
            root.left = insert(root.left, key);
        }
        else if (key>root.key){
            root.right = insert(root.right, key);
        }
        return root;
    }
    public Node findElement(Node root, int key){
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key){
            return root;
        }
        // Key is greater than root's key
        if (root.key < key){
            return findElement(root.right, key);
        }
        // Key is smaller than root's key
        else{
            return findElement(root.left, key);
        }
    }
    public int height(Node node)
    {
        if (node == null){
            return 0;
        }
        else
        {
            /* compute the depth of each subtree */
            int lDepth = height(node.left);
            int rDepth = height(node.right);

            /* use the larger one */
            if (lDepth > rDepth){
                return (lDepth + 1);
            }
            else {
                return (rDepth + 1);
            }
        }
    }
    public Node smallest(Node node){
        if (node.left != null){
            node = smallest(node.left);
        }
        return node;
    }
    public Node biggest(Node node){
        if (node.right != null){
            node = biggest(node.right);
        }
        return node;
    }
    public ArrayList<Node> inorder(Node root, ArrayList<Node> arr) {
        if (root == null){
            return arr;
        }

        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right, arr);
        return arr;
    }

    public Node kthlargest(Node root, int k) {
        ArrayList<Node> nums = inorder(root, new ArrayList<Node>());
        return nums.get(nums.size() - k);
    }

}
