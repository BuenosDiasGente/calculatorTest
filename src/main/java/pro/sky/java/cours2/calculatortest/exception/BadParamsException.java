package pro.sky.java.cours2.calculatortest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BadParamsException extends RuntimeException{


    public BadParamsException(String message) {
        super(message);
    }
}
