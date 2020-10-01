package com.maslov.headfirst.chapterSix;

import java.util.ArrayList;

public class ArrayListMagnet {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add(0, "noll");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printAl(a);
        if (a.contains("three")) {
            a.add("four");
        }
        a.remove("two");
        printAl(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAl(a);

        if (a.contains("two")) {
            a.add("2.2");
        }
        printAl(a);

    }

    public static void printAl(ArrayList<String> al) {

        for (String element: al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");

    }
}
