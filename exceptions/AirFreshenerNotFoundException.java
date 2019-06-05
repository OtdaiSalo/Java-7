package ua.lviv.iot.gym2.exceptions;

public class AirFreshenerNotFoundException extends RuntimeException {

    public AirFreshenerNotFoundException(Integer id) {
        super("Could not find air freshener " + id);
    }
}