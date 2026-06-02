package br.com.sistemabancario.exceptions;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
