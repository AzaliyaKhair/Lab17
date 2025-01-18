package ru.itis11403;

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }
    public WrongLoginException(String message) {
        super(message);
    }
}


