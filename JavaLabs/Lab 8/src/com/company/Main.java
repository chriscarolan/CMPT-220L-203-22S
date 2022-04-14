package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List a = new List(4);

        a.add(a, new List(5));
        a.add(a, new List(6));
        a.add(a, new List(3));
        a.add(a, new List(2));
        a.add(a, new List(9));

        a.printList(a);

        a.delete(a, 3);
        System.out.println();

        a.printList(a);

    }
}