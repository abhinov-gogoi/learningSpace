package phase1;

public class ExceptionsExample {
    public static void main(String[] args) {
        int[] arr= new int[10];
        int a = 1;
        int b = 0;
        String c = "pizza";

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("You cant divide by zero. Stupid !!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block will always execute, no matter exception occur or not");
        }

        System.out.println("rest of code will continue to execute");


    }
}
