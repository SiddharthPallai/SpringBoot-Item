package com.epicminds.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Sidharth
 */
@RestControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(value=ItemNotFoundException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ErrorResponse handleException(ItemNotFoundException ief){
//        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ief.getMessage());
//    }
}
