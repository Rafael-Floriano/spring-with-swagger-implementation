package br.com.rafael.floriano.spring_with_swagger_implementation.exception;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String messagem) {
        super(messagem);
    }

}
