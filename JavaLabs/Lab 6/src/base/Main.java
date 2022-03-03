package base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        int[] Array = new int[]{1,2,3,4,5};
        for(int i=0; i<5; i++){
            System.out.println(Array[i]);
        }
        System.out.println();
        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(1);
        intArray.add(3);
        for(int i=0; i<intArray.size(); i++) {
            System.out.println(intArray.get(i));
        }
        System.out.println();
        // Create an LinkedList, Populate it, and Print it out
        LinkedList<Integer> intList = new LinkedList<Integer>();
        intList.add(5);
        intList.add(8);
        for(int i=0; i<intList.size(); i++) {
            System.out.println(intList.get(i));
        }
        System.out.println();
        // Create a Queue, Populate it, and Print it out
        Queue<Integer> intQueue = new LinkedList<>();
        intQueue.add(4);
        intQueue.add(6);
        int initialSize = intQueue.size();
        for(int i=0; i<initialSize; i++) {
            System.out.println(intQueue.remove());
        }
        System.out.println();
        // Create a Stack, Populate it, and Print it out
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.add(3);
        intStack.add(7);
        while(!intStack.empty()){
            System.out.println(intStack.pop());
        }
        // Using the information in the Lab 6 J
        // upyter Notebook create an instance of plant here.
        Plants plant = new Plants(true, "sunflower", "rose");
    }
}
