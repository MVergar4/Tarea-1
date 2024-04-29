package org.example;
/**
 * Subclase Moneda900 que sirve meramente para devolver su valor.
 */
public class Moneda900 extends Moneda {
    /** Constructor que por defecto solo inicializa*/
    public Moneda900() {
        super();
    }

    /**
     * Metodo que devuelve el valor de la moneda
     * @return devuelve 500
     */
    public int getValor() {
        return 500;
    }
}
