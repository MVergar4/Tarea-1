package org.example;

/**
 * Subclase Moneda1000 que sirve meramente para devolver su valor.
 */
public class Moneda1000 extends Moneda {
    /** Constructor que por defecto solo inicializa*/
    public Moneda1000() {
        super();
    }

    /**
     * Metodo que devuelve el valor de la moneda
     * @return devuelve 1000
     */
    public int getValor() {
        return 1000;
    }
}
