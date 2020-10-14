package com.maslov.headfirst;

public class ChapterOne {
    public static void main(String[] args){

//        Aa aa = new Aa();
////        aa.setArg("3");
//        System.out.println(aa.arg);
////        Test test = new Test();
////        test.setArg("5");
////        System.out.println(test.arg);
//        System.out.println(aa.arg);
//        System.out.println(aa.newArgs);
//
//    }
//    String arg;
//    String go(String x) {
//        arg = x;
//        return x;
        Aa aa = new Aa();
        Test tt = new Aa();
        Bb bb = new Bb();
        Test tet = new Test();

        tet.test();
        tet.test2();
        tt.test();
        tt.test2();
        bb.test();
        bb.test2();
        aa.test();
        aa.test2();
        aa.test3();
        Bb newBb = bb;
        newBb.test();
        newBb.test2();
        newBb.test3();
        newBb.test4();
    }
}


class Test {
    String arg = "arg";
    void setArg (String t) {
        arg = t;
    }
    public void test() {
        System.out.println("Test test");
    }
    public void test2() {
        System.out.println("Test test2");
    }
}

class Aa extends Test {
    String newArgs = "New " + arg;
    public void test3() {
        System.out.println("Test aa");
    }
}

class Bb extends Aa {
    public void test4() {
        System.out.println("Test3");
    }
}