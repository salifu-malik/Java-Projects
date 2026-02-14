package com.mankind.patientBooking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //Handle ResourceNotFound
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity< Object> handleResourceNotFound (ResourceNotFoundException ex){

        ApiError error = new ApiError(
                ex.getMessage(),
                        HttpStatus.NOT_FOUND.value(),
                        "Not Found",
                LocalDateTime.now()
                );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);


    }

    //Handle BadRequestException
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity< Object> handleBadRequest (BadRequestException ex){
        ApiError error = new ApiError(
                ex.getMessage(),
                HttpStatus.BAD_REQUEST.value(),
                "Not Found",
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    //Handle generic exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity< Object> handleException (Exception ex){
        ApiError error = new ApiError(
                ex.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Not Found",
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
