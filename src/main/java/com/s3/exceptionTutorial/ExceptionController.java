package com.s3.exceptionTutorial;

import com.s3.exceptionTutorial.exception.KthException4;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequiredArgsConstructor
public class ExceptionController {
    private final ExceptionService exceptionService;

    @GetMapping("/exception")
    public ResponseEntity<?> exception(@RequestParam(value = "exceptionId")Long exceptionId){
        if(exceptionId==1){
            exceptionService.throwException1();
        } else if (exceptionId==2) {
            exceptionService.throwException2();
        } else if (exceptionId==3){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"KthException3");
        } else if (exceptionId==4){
            exceptionService.throwException4();
        } else if (exceptionId==5){
            exceptionService.throwException5();
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ExceptionHandler(KthException4.class)
    public ResponseEntity<ExceptionEntity> handleKthException(){
        return new ResponseEntity<>(ExceptionEntity.builder().message("KthException4").code(1103).build(),
                HttpStatus.OK);
    }
}
