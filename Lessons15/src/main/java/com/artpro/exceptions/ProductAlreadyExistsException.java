package com.artpro.exceptions;

public class ProductAlreadyExistsException extends Exception {
    public ProductAlreadyExistsException(String message) {
        super(message);
    }
}