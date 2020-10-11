package com.maslov.headfirst;

public class ChapterOne {
    public static void main(String[] args){

        Aa aa = new Aa();
//        aa.setArg("3");
        System.out.println(aa.arg);
//        Test test = new Test();
//        test.setArg("5");
//        System.out.println(test.arg);
        System.out.println(aa.arg);
        System.out.println(aa.newArgs);

    }
    String arg;
    String go(String x) {
        arg = x;
        return x;
    }
}


class Test {
    String arg = "arg";
    void setArg (String t) {
        arg = t;
    }
}

class Aa extends Test {
    String newArgs = "New " + arg;
}