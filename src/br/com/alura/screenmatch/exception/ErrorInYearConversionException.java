package br.com.alura.screenmatch.exception;

public class ErrorInYearConversionException extends RuntimeException {
    private String message;
    public ErrorInYearConversionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
