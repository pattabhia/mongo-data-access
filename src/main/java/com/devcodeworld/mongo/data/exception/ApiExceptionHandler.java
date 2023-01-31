package com.devcodeworld.mongo.data.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static java.util.List.of;

@ControllerAdvice
@Slf4j
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handleMissingResources(ResourceNotFoundException ex, WebRequest request) {
        log.info("error occurred on path {}", request.getContextPath());
        ApiError error = new ApiError(HttpStatus.BAD_REQUEST.value(), of(new ErrorMessage(ex.getMessage(), ex)));
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
