package phase1;
// https://www.geeksforgeeks.org/anonymous-inner-class-java/
// used in threading

class A {
    int a=1;
    void printA() {
        System.out.println("a= "+a);
    }
}

// an anonymous inner class with A as base class
public class AnonymousInnerClass {

    public static void main(String[] args) {
        A anonymous_class = new A(){
            int a=2;
            @Override
            void printA() {
                System.out.println(a);
            }
        };
        // we have not created inner class inside this class, but rather an instance of A
        anonymous_class.printA();
    }
}
