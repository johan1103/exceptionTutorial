package com.s3.exceptionTutorial;

import com.s3.exceptionTutorial.exception.KthException1;
import com.s3.exceptionTutorial.exception.KthException2;
import com.s3.exceptionTutorial.exception.KthException4;
import org.springframework.stereotype.Service;

@Service
public class ExceptionService {

    public void throwException1(){
        throw new KthException1();
    }
    public void throwException2(){
        throw new KthException2();
    }
    public void throwException4(){
        throw new KthException4();
    }
}
