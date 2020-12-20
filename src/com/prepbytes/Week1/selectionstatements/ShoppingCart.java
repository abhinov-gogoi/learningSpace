package com.prepbytes.Week1.selectionstatements;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0){
            double quantity = sc.nextFloat();
            double price = sc.nextFloat();
            double cost;
            if(quantity>100){
                cost = quantity * price * 0.8;
            }else
                cost = quantity * price;
            System.out.println(cost);
        }


    }
}