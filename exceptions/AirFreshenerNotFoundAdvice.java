package ua.lviv.iot.gym2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class AirFreshenerNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(AirFreshenerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String AirFreshenerNotFoundHandler(AirFreshenerNotFoundException ex) {
        return ex.getMessage();
    }
}
