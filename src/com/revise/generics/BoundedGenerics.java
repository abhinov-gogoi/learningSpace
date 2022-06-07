package com.revise.generics;

import com.revise.generics.helpers.Animal;
import com.revise.generics.helpers.Cat;

/**
 * we can 'bound' or restrict what kind of classes should the generic accept
 * we can extend the generic types with a parent class
 * AND / OR we can EXTEND the generic class with multiple interfaces also
 *
 * this will restrict the generic class to those classes only which have extended and/or implemented those interfaces
 */
public class BoundedGenerics<T extends Animal, SomeKindOfInterface, V extends Cat, List, AnyKindOfInterface> {
    T thingToPrint;

    public BoundedGenerics(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
