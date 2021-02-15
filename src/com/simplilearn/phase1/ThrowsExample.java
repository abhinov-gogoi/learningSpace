package phase1;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            m();
        }
        catch (ArithmeticException e){
            System.out.println("Exception: "+e.getMessage());
        }

    }

    static void m() {
        n();
    }

    static void n() throws ArithmeticException {
        throw new ArithmeticException("Hey you got EXCEPTION !!!!!!!");
    }
}
