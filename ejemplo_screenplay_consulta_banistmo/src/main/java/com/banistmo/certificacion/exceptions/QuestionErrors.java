package com.banistmo.certificacion.exceptions;

public class QuestionErrors extends AssertionError {
    public static final String FALLO_PREPARACION_PAGO = "Fallo al abrir el PDF de Tarifas de cuentas de deposito";
    public QuestionErrors(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
