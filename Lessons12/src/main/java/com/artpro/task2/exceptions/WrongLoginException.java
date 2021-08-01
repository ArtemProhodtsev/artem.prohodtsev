package com.artpro.task2.exceptions;

//задачу начал писать с написание исключений
public class WrongLoginException extends Exception {
    //сгенерили Override
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
