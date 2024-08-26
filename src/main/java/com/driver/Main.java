package com.driver;

public class Main {

    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public String meth() {
            return "Method is overridden is Extended class B";
        }
    }

    public static void main(String[] args) {
        B objB = new B();
        objB.meth();

        B Obj1 = new B();
        Obj1.meth();
//        System.out.println(objB.meth());
    }
}