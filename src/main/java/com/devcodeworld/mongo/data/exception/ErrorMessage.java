package com.devcodeworld.mongo.data.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ErrorMessage {

    @JsonProperty("message")
    private String message;

    @JsonProperty("trace")
    private Throwable trace;

    public ErrorMessage(String message, Throwable trace) {
        this.message = message;
        this.trace = trace;
    }
}
