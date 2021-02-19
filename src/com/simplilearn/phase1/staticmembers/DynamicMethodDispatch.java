package com.simplilearn.phase1.staticmembers;

// DynamicMethodDispatch is important because this is how Java implements runtime polymorphism
public class DynamicMethodDispatch {
    static class A {
        public void show() {
            System.out.println("in A");
        }
    }

    static class B extends A {
        @Override
        public void show() {
            System.out.println("in B");
        }

        public void config() {
            System.out.println("config in B");
        }
    }

    public static void main(String[] args) {
        // obj1 has reference of A but is an object of B (polymorphism)

        A obj1 = new B();
        obj1.show(); // prints B

        // But we cannot call other methods in Class B because reference of obj1 is of class A
        // obj1.config();
    }
}
