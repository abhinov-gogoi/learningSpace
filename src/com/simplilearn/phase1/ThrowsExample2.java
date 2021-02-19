package com.simplilearn.phase1;

public class ThrowsExample2 {
    public static void main(String[] args) {
        try{
            m(5);
        } catch (ArithmeticException e){
            System.out.println("1st: "+e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println("2nd: "+e.getMessage());
        } catch (CustomException e) {
            System.out.println("This is a Custom Exception : "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went Wrong, I have no Idea where : "+e.getMessage());
        }

    }

    static void m(int num) throws Exception {
        n(num);
    }

    static void n(int num) throws Exception  {
        if(num==1)
            throw new ArithmeticException("Hey you got EXCEPTION !!!!!!!");
        else if (num==2)
            throw new IndexOutOfBoundsException("HEY OUT OF INDEX MANN");
        else if (num==4)
            throw new CustomException(); // custom exception with predefined message
        else if (num==5)
            throw new CustomException("Custom Exception with Custom message");
        else
            throw new Exception();
    }
}
