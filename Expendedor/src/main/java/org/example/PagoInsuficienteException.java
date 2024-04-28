package org.example;

/**
 * Excepción que ocurre cuando la moneda no alcanza para comprar determinado producto.
 */
public class PagoInsuficienteException extends Exception{
    /** Constructor que recibe el error especificado.*/
    public PagoInsuficienteException(String errorMsg) {
        super(errorMsg);
    }
}
