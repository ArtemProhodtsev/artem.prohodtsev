package com.artpro.exceptions;

public class NoSuchProductException extends Exception {
    public NoSuchProductException(String message) {
        super(message);
    }
}