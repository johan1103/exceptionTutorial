package com.s3.exceptionTutorial;

import lombok.Builder;
import lombok.Data;

@Data
public class ExceptionEntity {
    private String message;
    private int code;

    @Builder
    public ExceptionEntity(String message,int code){
        this.message=message;
        this.code=code;
    }
}
