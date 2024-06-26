package org.example;
/**
 * Subclase Moneda400 que sirve meramente para devolver su valor.
 */
public class Moneda400 extends Moneda {
    /** Constructor que por defecto solo inicializa*/
    public Moneda400() {
        super();
    }

    /**
     * Metodo que devuelve el valor de la moneda
     * @return devuelve 400
     */
    public int getValor() {
        return 400;
    }
}
