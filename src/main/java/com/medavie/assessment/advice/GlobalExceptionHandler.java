package com.medavie.assessment.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationError(MethodArgumentNotValidException ex) {
        Map<String, String> body = new HashMap<>();
        FieldError fieldError = ex.getBindingResult().getFieldError();

        if (fieldError != null) {
            String field = fieldError.getField();
            String errorMsg = fieldError.getDefaultMessage();
            body.put("error", "Error with field `" + field + "`: " + errorMsg);
            return ResponseEntity.badRequest().body(body);
        }
        body.put("error", "Unknown validation error");
        return ResponseEntity.badRequest().body(body);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Map<String, String>> handleMessageNotReadableException(HttpMessageNotReadableException ex) {
        Map<String, String> body = new HashMap<>();
        body.put("error", ex.getMessage());
        return ResponseEntity.badRequest().body(body);
    }

}
