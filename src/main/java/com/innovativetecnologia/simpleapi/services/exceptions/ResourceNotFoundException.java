package com.innovativetecnologia.simpleapi.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 4435470272503775424L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
