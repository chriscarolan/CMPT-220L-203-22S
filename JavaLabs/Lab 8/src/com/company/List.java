package com.company;

public class List {

    public List nextListItem = null;
    public int value;

    public List(int newValue){
        value = newValue;
    }

    public boolean delete(List root, int index){
        List cur = root;
        List prev = root;
        int curIndex = 0;
        while(cur.nextListItem != null){
            if(curIndex == index){
                prev.nextListItem = cur.nextListItem;
                return true;
            }
            prev = cur;
            cur = cur.nextListItem;
            curIndex++;
        }
        return false;
    }

    public void add(List root, List newList){
        List cur = root;
        while(cur.nextListItem != null){
            cur = cur.nextListItem;
        }
        cur.nextListItem = newList;
    }

    public void printList(List root){
        List cur = root;
        while(cur.nextListItem != null){
            System.out.println(cur.value);
            cur = cur.nextListItem;
        }
        System.out.println(cur.value);
    }

}