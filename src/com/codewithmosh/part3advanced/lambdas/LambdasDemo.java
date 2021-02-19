package com.codewithmosh.part3advanced.lambdas;

public class LambdasDemo {

    public static void show() {
        greet(new ConsolePrinter());
    }

    public static void showByAnonymousInnerClassWay() {
        // here we pass a printer object into the greet method
        // but this object does not have a name
        // So, It is called an Anonymous Inner Class
        // Note that IntelliJ automatically wants to refactor this to a lambda
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void showByLambda() {
        // this is a lambda expression
        greet((String message) -> {
            System.out.println(message);
        });
        // we can shorten it by removing return type
        greet(message -> System.out.println(message));
        // shortest expression of the above lambda
        greet(System.out::println);


    }



    public static void greet(Printer printer){
        printer.print("Hello word");
    }
}
