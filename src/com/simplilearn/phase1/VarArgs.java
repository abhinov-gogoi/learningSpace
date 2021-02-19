package com.simplilearn.phase1;

// A method that takes variable number of integer arguments.
public class VarArgs {

    // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with different number
        // of parameters

        fun(100);         // one parameter
//        fun(1, 2, 3, 4);  // Will lead to AMBIGUITY
        fun();            // no parameter
        // the arguments are automatically
        // put into an array and passed into the method
    }

    // var-arg method
    static void fun(int ... a)
    {
        System.out.println("Number of arguments: " + a.length);

        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
        System.out.println();
    }

    static void fun(int a)
    {
        // above var-args method overloaded by non var arg method
    }

    static void fun(byte ... a)
    {
        // var-args method overloaded by different type parameter
    }

    static void fun(String str, int ... a)
    {
        // overloaded var-args method by adding a non var-arg parameter
        // of different type
    }

    static void fun(int a, int ... b)
    {
        // overloaded var-args method by adding a non var-arg parameter
        // of same type. It will lead to AMBIGUITY
    }
}