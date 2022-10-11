package com.qa.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetImplemenmentations {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add("a");
        hs.add("b");
        hs.add(4);
        hs.add(7);
        hs.add("t");
        hs.add("t");

        System.out.println(hs.size());
        System.out.println(hs);

    }
}
