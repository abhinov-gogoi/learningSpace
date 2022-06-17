package com.revise.java8.others;

import java.util.Optional;

/**
 * OPTIONAL class introduced in Java8 to handle null values
 *
 * Note that optional is not SERIALIZABLE
 */
public class LearnOptionalClass {
    public static void main(String[] args) {
        String str = null;

        Optional<String> optional = Optional.ofNullable(str);
//        System.out.println(optional.get()); // throws exception if optional container is null
        System.out.println(optional.isPresent());

        System.out.println(optional.orElse("orElse method returns other object if optional is empty"));
    }
}
