package com.maslov.headfirst.chapterEight;

class SomeClass {
    public void method() {
        System.out.println("Class MyClass: method()");
    }
}

class MyClass {
    SomeClass field;
    public MyClass (SomeClass var) {
        field = var;
        field.method();
    }
}
