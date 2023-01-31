package com.devcodeworld.mongo.data.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ApiError {

    @JsonProperty("status")
    private Integer statusCode;
    @JsonProperty("timestamp")
    private LocalDateTime localDateTime;
    @JsonProperty("errors")
    private List<ErrorMessage> errors;

    public ApiError(Integer statusCode, List<ErrorMessage> errors) {
        this.statusCode = statusCode;
        this.localDateTime = LocalDateTime.now(Clock.systemDefaultZone());
        this.errors = errors;
    }
}

