package org.example;

/**
 * Excepción que ocurre cuando a la Expendedora no se le entrega ninguna moneda
 */
public class PagoIncorrectoException extends Exception {
    /** Constructor que recibe el error especificado.*/
    public PagoIncorrectoException(String errorMsg) {
        super(errorMsg);
    }
}