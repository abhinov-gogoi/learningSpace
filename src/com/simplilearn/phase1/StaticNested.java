package phase1;

public class StaticNested {
    int a=12;

    // static classes are NOT technically inner classes
    static class Inner {
        public static void innerMethod() {
            System.out.println();
            outerMethod();
        }
    }

    public class Inner2 {
        void print() {
            System.out.println(a);
        }
    }


    private static void outerMethod () {
        System.out.println("inside outer method");
    }



}
