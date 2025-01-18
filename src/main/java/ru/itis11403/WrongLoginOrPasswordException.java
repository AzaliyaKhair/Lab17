package ru.itis11403;

public class WrongLoginOrPasswordException extends Exception {
    public WrongLoginOrPasswordException() {
        super();
    }
    public WrongLoginOrPasswordException(String message) {
        super(message);
    }
}
