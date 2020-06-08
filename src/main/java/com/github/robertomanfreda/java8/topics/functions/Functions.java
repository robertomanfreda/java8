package com.github.robertomanfreda.java8.topics.functions;

import com.github.robertomanfreda.java8.topics.ITopic;

public class Functions implements ITopic {

    public Functions() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        System.out.println("\n---------- Functions ----------");
        String intro = "Le functions implementano le functional interfaces, prendono in input 2 o più valori (di " +
                "diverso tipo) e restituiscono un solo valore in output.\n" +
                "Esempio perfetto la classe BiFunction <T,U,R> che prende in input 2 parametri di tipo T e U e " +
                "restituiece un valore di tipo R tramite il metodo con firma R apply(...)";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        String function = new MyFunction().apply(1);
        System.out.println("\nFunction: " + function);

        String biFunction = new MyBiFunction().apply(1, 2);
        System.out.println("\nbiFunction: " + biFunction);

        String triFunction = new MyTriFunction().apply(1, 2, 3D);
        System.out.println("\ntriFunction: " + triFunction);
    }
}
