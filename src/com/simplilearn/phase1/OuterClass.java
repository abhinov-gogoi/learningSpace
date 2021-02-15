package phase1;

/**
    Method Local Inner classes:
    1) Inner class can be declared within a method of an outer class
    2) For (JDK-7/6) Method Local inner classes can’t use local variable of outer method
     until that local variable is not declared as final.
     The main reason we need to declare a local variable as a final is that
     local variable lives on stack till method is on the stack
     but there might be a case the object of inner class still lives on the heap.
 */

// Inner classes adds an extra layer of Security
public class OuterClass {

    public int data = 30;

    void displayOuter() {
        System.out.println("I am inside the outer class");
        class InnerClassInsideOuterMethod {
            void displayInnerClassInsideOuterMethod() {
                System.out.println("I am inside a inner class of Outer class method");
                // NOTE method can call displayOuter2
                displayOuter2();
            }
        }
    }

    public void displayOuter2() {
        System.out.println("Display outer 2");
    }

    class InnerClass {
        int inner_var = 45;
        void displayInner() {
            System.out.println("I am inside inner class");
        }
    }



}
