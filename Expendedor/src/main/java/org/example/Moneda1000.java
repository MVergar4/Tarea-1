package org.example;

/**
 * Subclase Moneda1000 que sirve meramente para devolver su valor.
 */
public class Moneda1000 extends Moneda {
    /** Constructor */
    public Moneda1000() {
        super();
    }
    /** Devuelve el valor de la moneda, en este caso es 1000.*/
    public int getValor() {
        return 1000;
    }
}
