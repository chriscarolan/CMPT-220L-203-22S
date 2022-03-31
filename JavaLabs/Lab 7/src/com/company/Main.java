package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ListItem a = new ListItem(null);
        ListItem b = new ListItem(a);
        ListItem c = new ListItem(b);
        ListItem d = new ListItem(c);
        ListItem e = new ListItem(d);
    }
}
