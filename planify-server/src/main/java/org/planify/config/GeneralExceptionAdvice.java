package org.planify.config;

import jakarta.persistence.EntityNotFoundException;
import org.apache.catalina.connector.ClientAbortException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralExceptionAdvice {
    static final String UNKNOWN_ERROR_MSG = "An unknown error occurred";
    static final String ACCESS_DENIED_MSG = "Access denied!";

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception exception) {
        // Do not log and handle Host Machine Abort / Connection Lost
        if (exception.getClass().equals(ClientAbortException.class)) {
            return null;
        }

        return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(exception.getMessage());
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<String> handleUserNotFound(AuthenticationException authenticationException) {
        return ResponseEntity
            .status(HttpStatus.UNAUTHORIZED)
            .body(authenticationException.getMessage());
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleEntityNotFound(EntityNotFoundException exception) {

        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(exception.getMessage());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<String> handleAccessDeniedException(AccessDeniedException exception) {

        return ResponseEntity
            .status(HttpStatus.FORBIDDEN)
            .body(ACCESS_DENIED_MSG);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException exception) {

        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(exception.getMessage());
    }
}
