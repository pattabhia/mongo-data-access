package com.devcodeworld.mongo.data.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Integer id) {
        super("resource not found for id " + id);
    }
}
