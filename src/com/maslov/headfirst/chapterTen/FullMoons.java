package com.maslov.headfirst.chapterTen;

import java.util.*;
import static java.lang.System.out;
import java.io.*;

public class FullMoons {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2004, 1, 7, 15, 40);

        for (int x = 0; x < 60; x++) {
            long day1 = c.getTimeInMillis();
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("Полнолуние было в %tc", c));
        }

    }
}
