package com.mankind.patientBooking.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException (String message) {
        super(message);
    }
}
