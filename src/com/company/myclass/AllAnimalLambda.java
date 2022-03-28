package com.company.myclass;

import java.util.function.Consumer;

public interface AllAnimalLambda {

    Consumer<String> cs1 = s -> System.out.println(s);

    Consumer<String> cs2 = s -> {
        System.out.println("22222");
        System.out.println(s);
    };

    Consumer<String> cs3 = s -> {
        System.out.println("3333");
        System.out.println(s);
    };
}
