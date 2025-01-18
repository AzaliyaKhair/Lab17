package ru.itis11403;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
