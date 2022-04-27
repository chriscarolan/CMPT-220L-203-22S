package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BST tree = new BST();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(1);

        System.out.println("Find number 3: " + tree.findElement(tree.root, 3));
        System.out.println("Height is: " + tree.height(tree.root));
        System.out.println("Smallest is: " + tree.smallest(tree.root).key);
        System.out.println("Largest is: " + tree.biggest(tree.root).key);
        System.out.println("The 3rd largest is: " + tree.kthlargest(tree.root,3).key);
    }

}
