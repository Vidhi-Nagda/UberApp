package com.vidhi.project.uber.uberapp.exceptions;

public class RunTimeConflictException extends RuntimeException {
    public RunTimeConflictException(){

    }

    public RunTimeConflictException(String messge){
        super(messge);
    }

}
