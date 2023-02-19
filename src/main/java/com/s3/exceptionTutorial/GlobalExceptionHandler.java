package com.s3.exceptionTutorial;

import com.s3.exceptionTutorial.exception.KthException1;
import com.s3.exceptionTutorial.exception.KthException5;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.DispatcherServlet;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(KthException1.class)
    public ResponseEntity<ExceptionEntity> handleKthException1(){
        return new ResponseEntity<>(ExceptionEntity.builder().message("KthException1").code(1103).build(),
                HttpStatus.OK);
    }
    @ExceptionHandler(KthException5.class)
    public ResponseEntity<ExceptionEntity> handleKthException5(){
        return new ResponseEntity<>(ExceptionEntity.builder().message("KthException5").code(1103).build(),
                HttpStatus.OK);
    }
}
