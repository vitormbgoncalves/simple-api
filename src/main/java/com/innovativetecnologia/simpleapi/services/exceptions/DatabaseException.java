package com.innovativetecnologia.simpleapi.services.exceptions;

public class DatabaseException extends RuntimeException{

    private static final long serialVersionUID = 1094250811493312709L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
