package com.andersondolce.workshopmongo.services.exception;

public class ObjetoNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ObjetoNotFoundException(String msg){
        super(msg);
    }
}
