package org.example;

import java.security.spec.ECFieldF2m;

public class NameException extends Exception {

    private String name;
    public NameException(String message, String name) {
        super(message);
        this.name = name;
    }



}
