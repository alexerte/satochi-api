package com.Blockchaine.Satochi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @ControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(CurrencyNotFoundException.class)
        public ResponseEntity<ErrorResponse> handleNotFound(CurrencyNotFoundException ex) {
            ErrorResponse error = new ErrorResponse(404, ex.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(error);
        }
    }

