package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BST {
    // creation of binary search tree class.
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
    // inserts nodes into BST, where we put it the nodes that is greater than the root to the right and
    // the nodes less than or equal to the root to the left
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
        // root is null or key is present at root
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
            // gives us the height of the tree. Counts how far the tree goes down and
            // tells us how long the longest branch is.
    {
        if (node == null){
            return 0;
        }
        else
        {
            //gives us the depth of each section of the tree.
            int lDepth = height(node.left);
            int rDepth = height(node.right);

            //see the larger one
            if (lDepth > rDepth){
                return (lDepth + 1);
            }
            else {
                return (rDepth + 1);
            }
        }
    }
    public Node smallest(Node node){
        // goes as far to the left as possible to find us the smallest element that is
        // in our tree
        if (node.left != null){
            node = smallest(node.left);
        }
        return node;
    }
    public Node biggest(Node node){
        // goes as far to the right as possible to find us the biggest element that is
        // in our tree
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
        // Based on what value is entered in for k, it tells us the kth largest value.
        ArrayList<Node> nums = inorder(root, new ArrayList<Node>());
        return nums.get(nums.size() - k);
    }
    public Node deleteElement(Node root, int key){
        // based on what value is entered for the key, it finds whether that value is to the
        // left or right and then when it eventually gets to it, it is deleted.
        if (root == null){
            return root;
        }
        if (key < root.key){
            root.left = deleteElement(root.left, key);
        }
        else if (key > root.key){
            root.right = deleteElement(root.right, key);
        }
        else {
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            root.key = reorganize(root.right);

            root.right = deleteElement(root.right, root.key);
        }

        return root;
    }

    public int reorganize(Node root){
        // Once the element is deleted, it must look to see if it has children, and then
        // how to reorganize those children since the tree has been changed.
        int minval = root.key;
        while (root.left != null)
        {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }
    public void postorder(Node node)
            // traversing the tree in postorder(left, right, root).
            // we start from the bottom left and work our way to the right and up.
    {
        if (node == null) {
            return;
        }

        postorder(node.left);

        postorder(node.right);

        System.out.print(node.key + " ");
    }

    public void inorder(Node node)
            // traversing the tree in inorder(left, root, right).
            // we start from the bottom left and work our way up and to the right.
    {
        if (node == null) {
            return;
        }

        inorder(node.left);

        System.out.print(node.key + " ");

        inorder(node.right);
    }
    public void preorder(Node node)
            // traversing the tree in preorder(left, root, right).
            // we start from the top and work our way down to the left then right.
    {
        if (node == null) {
            return;
        }

        System.out.print(node.key + " ");

        preorder(node.left);

        preorder(node.right);
    }
    public Node postorderDFS(Node node, int key)
            // Depth first search
            // start at the root, and start going down one level at a time
            // This allows us to search for whatever key is entered into it
    {

        if(node.key == key){
            return node;
        }

        Node ans = null;

        if(node.left != null){
            ans = postorderDFS(node.left, key);
        }

        if(node.right != null){
            ans = postorderDFS(node.right, key);
        }

        return ans;

    }
    static Node searchBFS(Node root, int key) {
        // Breadth first search
        // start at the root, and then go dow each subtree one at a time, from left to right.
        // This allows us to search for whatever key is entered into it
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node ans = null;
        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.key == key){
                ans = temp;
                break;
            }
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        return ans;
    }


}
